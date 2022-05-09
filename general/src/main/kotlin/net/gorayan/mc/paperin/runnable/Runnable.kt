package net.gorayan.mc.paperin.runnable

import org.bukkit.plugin.java.JavaPlugin

/**
 * BukkitRunnableを生成
 * @param plugin JavaPlugin
 * @param delay 遅延(tick)
 * @param period 周期(tick)
 * @param count 実行回数
 * @param block 実行内容
 * @return BukkitRunnableObservable
 */
fun bukkitRunnable(
    plugin: JavaPlugin,
    delay: Long = 0,
    period: Long = 1,
    count: Int = 1,
    block: Cancelable.() -> Unit
): BukkitRunnableObservable {

    val runnable = BukkitRunnableImpl(count, block)

    runnable.runTaskTimer(plugin, delay, period)

    return runnable

}

/**
 * BukkitRunnableを生成
 * @param plugin JavaPlugin
 * @param delay 遅延(tick)
 * @param period 周期(tick)
 * @param block 実行内容
 * @return BukkitRunnableObservable
 */
fun bukkitRunnableTimer(plugin: JavaPlugin, delay: Long, period: Long, block: Cancelable.() -> Unit) = bukkitRunnable(
    plugin,
    delay,
    period,
    count = Int.MAX_VALUE,
    block = block
)

/**
 * BukkitRunnableを生成
 * @param plugin JavaPlugin
 * @param delay 遅延(tick)
 * @param block 実行内容
 * @return BukkitRunnableObservable
 */
fun bukkitRunnableLater(plugin: JavaPlugin, delay: Long, block: Cancelable.() -> Unit): BukkitRunnableObservable = bukkitRunnable(
    plugin,
    delay,
    count = 1,
    block = block
)