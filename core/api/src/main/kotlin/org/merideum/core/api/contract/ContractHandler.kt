package org.merideum.core.api.contract

import java.util.UUID

abstract class ContractHandler {

    /**
     * Save the Contract script content.
     */
    abstract fun save(script: String): String

    /**
     * Get the Contract script content by its id.
     */
    abstract fun get(id: String): String

    /**
     * Generates a unique id for a contract to save.
     * For now, the id is a random UUID with dashes removed.
     */
    fun generateId(): String = UUID.randomUUID().toString().replace("-", "")
}
