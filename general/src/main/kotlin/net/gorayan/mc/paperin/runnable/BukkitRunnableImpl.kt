package net.gorayan.mc.paperin.runnable

import org.bukkit.scheduler.BukkitRunnable

internal class BukkitRunnableImpl(count: Int, private val block: BukkitRunnableObservable.() -> Unit) : BukkitRunnable(), BukkitRunnableObservable {

    private val counter = TaskCounter(count) { finish() }
    private val cancelCallbacks = Callbacks<Unit>()
    private val finishCallbacks = Callbacks<Unit>()
    private val errorCallbacks = Callbacks<Exception>()

    override fun run() {

        // Task 実行
        try {

            this.block()

        } catch (e: Exception) {

            // 例外処理

            // Callbackが無い場合
            if (errorCallbacks.isEmpty()) e.printStackTrace()

            // Callbackがある場合
            errorCallbacks.invoke(e)

        }

        // カウンターを減らす
        counter.down()

    }

    override fun onCancel(callback: () -> Unit) {
        cancelCallbacks += callback
    }

    override fun onError(callback: (Exception) -> Unit) {

        errorCallbacks += callback
    }

    override fun onFinish(callback: () -> Unit) {
        finishCallbacks += callback
    }

    override fun cancel() {

        super.cancel()

        cancelCallbacks.invoke()

    }

    private fun finish() {

        super.cancel()

        finishCallbacks.invoke()

    }

    private fun Callbacks<Unit>.invoke() = invoke(Unit)
    private operator fun Callbacks<Unit>.plusAssign(callback: () -> Unit) = plusAssign { callback() }

}