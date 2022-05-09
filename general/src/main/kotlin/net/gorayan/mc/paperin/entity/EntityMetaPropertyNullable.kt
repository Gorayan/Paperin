package net.gorayan.mc.paperin.entity

import net.gorayan.mc.paperin.javaplugin.getProvidingPlugin
import org.bukkit.entity.Entity
import org.bukkit.metadata.FixedMetadataValue
import kotlin.reflect.KProperty

class EntityMetaPropertyNullable<T>(private val key: String) {

    private val plugin = getProvidingPlugin()

    @Suppress("UNCHECKED_CAST")
    operator fun getValue(thisRef: Entity, property: KProperty<*>): T? {

        val metaValue = thisRef.getMetadata(key).find { it.owningPlugin == plugin } ?: return null

        return metaValue.value() as? T

    }

    operator fun setValue(thisRef: Entity, property: KProperty<*>, value: T?) {

        val metaValue = FixedMetadataValue(plugin, value)

        thisRef.setMetadata(key, metaValue)

    }

}