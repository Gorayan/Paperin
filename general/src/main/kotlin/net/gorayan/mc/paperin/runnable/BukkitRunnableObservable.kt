package net.gorayan.mc.paperin.runnable

/**
 * タスクをキャンセルしたり、キャンセル時のコールバックを登録可能
 */
interface BukkitRunnableObservable : Cancelable {

    /**
     * Runnableがキャンセルされたときのコールバックを追加
     * @param callback コールバック
     */
    fun onCancel(callback: () -> Unit)

}