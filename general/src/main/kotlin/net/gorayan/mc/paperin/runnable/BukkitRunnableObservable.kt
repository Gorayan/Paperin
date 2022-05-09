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

    /**
     * Runnableが終了したときのコールバックを追加
     * @param callback コールバック
     */
    fun onFinish(callback: () -> Unit)

    /**
     * Runnable内でエラーが起きたときのコールバックを追加
     * @param callback コールバック
     */
    fun onError(callback: (Exception) -> Unit)

}