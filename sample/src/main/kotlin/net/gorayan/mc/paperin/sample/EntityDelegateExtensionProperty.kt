package net.gorayan.mc.paperin.sample

import net.gorayan.mc.paperin.entity.EntityMetaPropertyNullable
import org.bukkit.entity.Entity

var Entity.health: Double? by EntityMetaPropertyNullable("health")

fun Entity.damage(value: Double) {

    health = health?.minus(value)

}