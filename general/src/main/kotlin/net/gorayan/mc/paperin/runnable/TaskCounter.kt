package net.gorayan.mc.paperin.runnable

internal class TaskCounter(count: Int, private val callback: () -> Unit) {

    private var count = count

    fun down() {

        if (count == 0) return

        count --

        if (count == 0) callback()

    }

}