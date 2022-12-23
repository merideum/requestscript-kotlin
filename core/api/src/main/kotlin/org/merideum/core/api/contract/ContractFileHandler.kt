package org.merideum.core.api.contract

import java.io.File
import java.nio.file.Files
import java.nio.file.Paths

/**
 * A default implementation of the [ContractHandler] that saves contracts to the file system.
 * This implementation should be replaced with a customized solution when long-term persistence is needed.
 */
class ContractFileHandler: ContractHandler() {
    private val contractsFolder = "./contracts"

    init {
        prepare()
    }

    /**
     * Creates the contract directory if it does not exist.
     */
    private fun prepare() {
        if (!File(contractsFolder).isDirectory) {
            Files.createDirectory(Paths.get(contractsFolder))
        }
    }

    /**
     * Saves a contract in the location.
     * @param script the script text as String.
     *
     * @return The id of the contract (its file name) so it can be retrieved later.
     */
    override fun save(script: String): String {
        val id = generateId()

        File("$contractsFolder/$id").also {
            it.createNewFile()
            it.writeText(script)
        }

        return id
    }

    override fun get(id: String): String {
        return File("$contractsFolder/$id").readText()
    }
}
