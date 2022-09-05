package org.merideum.core.interpreter

interface ResourceResolver {
    fun resolve(name: String): Resource<*>?
    fun resolve(name: String, path: String): Resource<*>?
}
