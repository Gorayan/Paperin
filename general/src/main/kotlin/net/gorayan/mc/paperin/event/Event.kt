package net.gorayan.mc.paperin.event

import org.bukkit.event.Cancellable

fun Cancellable.cancel() {
    this.isCancelled = true
}