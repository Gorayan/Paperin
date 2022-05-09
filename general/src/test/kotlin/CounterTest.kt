import net.gorayan.mc.paperin.runnable.TaskCounter
import org.junit.Test

class CounterTest {

    @Test
    fun test() {

        var finished = false
        val counter = TaskCounter(2) { finished = true }

        counter.down()
        assert(!finished)
        counter.down()
        assert(finished)

    }

    @Test
    fun test2() {

        var finished = false
        val counter = TaskCounter(Int.MAX_VALUE) { finished = true }

        counter.down()
        assert(!finished)
        counter.down()
        assert(!finished)

    }

}