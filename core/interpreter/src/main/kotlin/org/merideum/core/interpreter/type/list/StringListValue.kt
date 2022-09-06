package org.merideum.core.interpreter.type.list

import org.merideum.core.interpreter.type.StringValue
import org.merideum.core.interpreter.type.Type
import org.merideum.core.interpreter.type.TypedValue

data class StringListValue(override val value: List<StringValue>) : ListValue<StringValue, String> {
    override fun getValue(index: Int): TypedValue<*> {
        return value[index]
    }

    override val type = Type.LIST_STRING
}
