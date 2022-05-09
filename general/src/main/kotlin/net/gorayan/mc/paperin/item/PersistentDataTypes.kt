package net.gorayan.mc.paperin.item

import org.bukkit.persistence.PersistentDataType

val PersistentDataTypeBoolean: PersistentDataType<String, Boolean> = CustomPersistentDataType.typeOf(
    { toString() },
    { toBoolean() }
)

val PersistentDataTypeStringArray: PersistentDataType<String, Array<String>> = CustomPersistentDataType.typeOf(
    { this.joinToString(",") },
    { this.split(",").toTypedArray() }
)