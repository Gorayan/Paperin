package net.gorayan.mc.paperin.runnable

import org.bukkit.scheduler.BukkitRunnable

internal class BukkitRunnableImpl(count: Int, private val block: BukkitRunnableObservable.() -> Unit) : BukkitRunnable(), BukkitRunnableObservable {

    private val counter = TaskCounter(count) { cancel() }
    private val callbacks = mutableSetOf<() -> Unit>()

    override fun run() {

        // Task 実行
        this.block()

        // カウンターを減らす
        counter.down()

    }

    override fun onCancel(callback: () -> Unit) {
        callbacks.add(callback)
    }

    override fun cancel() {
        super.cancel()

        callbacks.forEach {

            try {

                it()

            } catch (e: Exception) {

                e.printStackTrace()

            }

        }

    }
}