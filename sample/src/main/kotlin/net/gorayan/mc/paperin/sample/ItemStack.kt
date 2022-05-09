package net.gorayan.mc.paperin.sample

import net.gorayan.mc.paperin.item.lore
import net.gorayan.mc.paperin.item.name
import net.gorayan.mc.paperin.text.*
import net.kyori.adventure.text.Component
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

fun createJoinMessage() = Component.text("ようこそ").green().bold()

fun createSampleItemStack() =
    ItemStack(Material.DIAMOND)
        .name(itemText("サンプル").green().bold())
        .lore(
            emptyText(),
            itemText("サンプルアイテム").gray(),
        )