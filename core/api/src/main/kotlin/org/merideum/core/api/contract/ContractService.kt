package org.merideum.core.api.contract

import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
import java.util.*

/**
 * A Service to save, retrieve, and call contracts.
 */
class ContractService {
    private val contractsFolder = "./contracts"

    /**
     * Creates the contract directory if it does not exist.
     */
    fun prepare() {
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
    fun save(script: String): String {
        val id = generateId()

        File("$contractsFolder/$id").also {
            it.createNewFile()
            it.writeText(script)
        }


        return id
    }

    fun get(id: String): String {
        return File("$contractsFolder/$id").readText()
    }

    /**
     * Generates a unique id for a contract to save.
     * For now, the id is a random UUID with dashes removed.
     */
    private fun generateId(): String {
        return UUID.randomUUID().toString().replace("-", "")
    }
}
