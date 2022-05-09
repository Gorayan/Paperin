package net.gorayan.mc.paperin.sample

import net.gorayan.mc.paperin.item.itemStackPropertyDouble
import net.gorayan.mc.paperin.item.itemStackPropertyInt
import org.bukkit.inventory.ItemStack

var ItemStack.level: Int? by itemStackPropertyInt("level")
var ItemStack.power: Double? by itemStackPropertyDouble("power")

fun ItemStack.onLevelUp() {

    val currentLevel = level?: 1
    val currentPower = power?: 0.0

    level = currentLevel + 1
    power = currentLevel * 5.0

}