package net.gorayan.mc.paperin.sound

import org.bukkit.Location
import org.bukkit.Sound
import org.bukkit.SoundCategory
import org.bukkit.entity.Player

fun Player.playSound(sound: Sound, volume: Float = 3.0f, pitch: Float = 1.0f, category: SoundCategory = SoundCategory.NEUTRAL) {
    this.playSound(this.location, sound, category, volume, pitch)
}

fun Location.playSound(sound: Sound, volume: Float = 3.0f, pitch: Float = 1.0f, category: SoundCategory = SoundCategory.NEUTRAL) {
    this.world.playSound(this, sound, category, volume, pitch)
}