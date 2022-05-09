package net.gorayan.mc.paperin.javaplugin

import org.bukkit.command.TabExecutor
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

fun JavaPlugin.registerEventListener(listener: Listener) {

    server.pluginManager.registerEvents(listener, this)

}

fun JavaPlugin.registerCommand(name: String, tabExecutor: TabExecutor) {

    val command = server.getPluginCommand(name)?: return

    command.setExecutor(tabExecutor)
    command.tabCompleter = tabExecutor

}

fun Any.getProvidingPlugin(): JavaPlugin {

    return JavaPlugin.getProvidingPlugin(this::class.java)

}