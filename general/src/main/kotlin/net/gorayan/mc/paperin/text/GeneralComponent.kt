package net.gorayan.mc.paperin.text

import net.kyori.adventure.text.Component

fun itemText(text: String): Component {

    return Component.text(text).resetStyleItemStack()

}

fun planeText(text: String): Component {

    return Component.text(text).resetStyle()

}

fun emptyText(): Component {

    return Component.empty()

}