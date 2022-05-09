package net.gorayan.mc.paperin.text

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.serializer.gson.GsonComponentSerializer

fun Component.json(): String {
    return GsonComponentSerializer.gson().serialize(this)
}