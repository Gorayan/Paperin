package net.gorayan.mc.paperin.particle

import org.bukkit.Location
import org.bukkit.Particle

fun <T> Location.spawnParticle(
    particle: Particle,
    extra: Double = 0.0,
    count: Int = 1,
    offsetX: Double = 0.0,
    offsetY: Double = 0.0,
    offsetZ: Double = 0.0,
    data: T? = null
) {

    world.spawnParticle(
        particle,
        this,
        count,
        offsetX, offsetY, offsetZ,
        extra,
        data
    )

}