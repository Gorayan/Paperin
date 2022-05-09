package net.gorayan.mc.paperin.runnable

internal class Callbacks<T> {

    private val callbacks = mutableSetOf<(T) -> Unit>()

    operator fun plusAssign(callback: (T) -> Unit) {

        callbacks.add(callback)

    }

    fun invoke(value: T) {

        callbacks.forEach {

            try {
                it(value)
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }

    }

    fun isEmpty() = callbacks.isEmpty()

}