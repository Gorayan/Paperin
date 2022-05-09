package net.gorayan.mc.paperin.runnable

/**
 * BukkitRunnableのキャンセル処理のみを行えるインターフェース
 */
interface Cancelable {

    /**
     * Runnableがキャンセルされたかどうかを返す
     * @return キャンセルされたかどうか
     */
    fun isCancelled(): Boolean

    /**
     * Runnableをキャンセルする
     */
    fun cancel()

}