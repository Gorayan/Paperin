package net.gorayan.mc.paperin.sample

import net.gorayan.mc.paperin.runnable.bukkitRunnable
import net.kyori.adventure.text.Component
import org.bukkit.entity.Player
import org.bukkit.plugin.java.JavaPlugin

/**
 * 3,2,1と表示した後、最後にスタート！と表示する
 * プレイヤーがいなければ止める
 */
fun timer(plugin: JavaPlugin, player: Player) {

    var time = 3

    val runnable = bukkitRunnable(
        plugin,
        period = 20,
        count = 3
    ) {

        // プレイヤーがいなければエラー
        if (!player.isOnline) throw IllegalStateException("プレイヤーがいません")

        // プレイヤーに通知
        player.sendActionBar(Component.text(time))

        // カウントダウン
        time --

    }

    runnable.onFinish {

        // 最後にスタート！と表示
        player.sendActionBar(Component.text("スタート！"))

    }

    runnable.onError {

        // エラーが発生したら止める
        runnable.cancel()

    }

}