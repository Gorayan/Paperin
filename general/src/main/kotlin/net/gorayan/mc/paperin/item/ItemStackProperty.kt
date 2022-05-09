package net.gorayan.mc.paperin.item

import org.bukkit.persistence.PersistentDataType

// Primitive
fun itemStackPropertyDouble(key: String) = ItemStackPersistentPropertyNullable(key, PersistentDataType.DOUBLE)
fun itemStackPropertyFloat(key: String) = ItemStackPersistentPropertyNullable(key, PersistentDataType.FLOAT)
fun itemStackPropertyInt(key: String) = ItemStackPersistentPropertyNullable(key, PersistentDataType.INTEGER)
fun itemStackPropertyLong(key: String) = ItemStackPersistentPropertyNullable(key, PersistentDataType.LONG)
fun itemStackPropertyByte(key: String) = ItemStackPersistentPropertyNullable(key, PersistentDataType.BYTE)
fun itemStackPropertyShort(key: String) = ItemStackPersistentPropertyNullable(key, PersistentDataType.SHORT)


// String
fun itemStackPropertyString(key: String) = ItemStackPersistentPropertyNullable(key, PersistentDataType.STRING)


// Tag Container
fun itemStackPropertyTagContainer(key: String) = ItemStackPersistentPropertyNullable(key, PersistentDataType.TAG_CONTAINER)
fun itemStackPropertyTagContainerArray(key: String) = ItemStackPersistentPropertyNullable(key, PersistentDataType.TAG_CONTAINER_ARRAY)


// Custom
fun itemStackPropertyBoolean(key: String) = ItemStackPersistentPropertyNullable(key, PersistentDataTypeBoolean)
fun itemStackPropertyStringArray(key: String) = ItemStackPersistentPropertyNullable(key, PersistentDataTypeStringArray)