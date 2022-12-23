package org.merideum.core.api.contract

import java.lang.IllegalArgumentException

/**
 * A default implementation of the [ContractHandler] that stores contracts in memory.
 * This implementation should not be used in non-test contexts.
 */
class ContractInMemoryHandler: ContractHandler() {

    private val contracts = mutableMapOf<String, String>()

    override fun save(script: String): String {
        val generateId = generateId()

        contracts[generateId] = script

        return generateId
    }

    override fun get(id: String): String {
        return contracts[id] ?: throw IllegalArgumentException("Could not get Contract for id: $id")
    }
}
