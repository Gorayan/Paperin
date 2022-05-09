package net.gorayan.mc.paperin.item

import net.kyori.adventure.text.Component
import org.bukkit.Color
import org.bukkit.OfflinePlayer
import org.bukkit.inventory.ItemFlag
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.LeatherArmorMeta
import org.bukkit.inventory.meta.SkullMeta

/**
 * エンチャントとかアトリビュートが消える
 */
fun ItemStack.hideInformation(): ItemStack {

    ItemFlag.values().forEach {
        addItemFlags(it)
    }

    return this

}

fun ItemStack.owner(player: OfflinePlayer): ItemStack {

    editMeta {
        if (it !is SkullMeta) return@editMeta
        it.owningPlayer = player
    }

    return this

}

fun ItemStack.name(component: Component): ItemStack {

    editMeta {
        it.displayName(component)
    }

    return this

}

fun ItemStack.lore(vararg components: Component): ItemStack {

    editMeta {
        it.lore(components.toList())
    }

    return this

}

fun ItemStack.count(count: Int): ItemStack {

    amount = count

    return this

}

fun ItemStack.color(color: Color): ItemStack {

    editMeta {

        if (it is LeatherArmorMeta) {
            it.setColor(color)
        }

    }

    return this

}

fun ItemStack.unbreak(): ItemStack {

    editMeta {

        it.isUnbreakable = true

    }

    return this

}