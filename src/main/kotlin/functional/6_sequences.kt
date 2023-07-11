package functional

import kotlin.system.measureTimeMillis

fun main() {
    val veryLongList = (1..999999L).toList()

    var sum = 0L
    var lazySum = 0L

    val msNonLazy = measureTimeMillis {
        sum = veryLongList
            .filter { it > 50 }
            .take(1000)
            .map { it * 2 }
            .sum()
    }

    val msLazy = measureTimeMillis {
        lazySum = veryLongList
            .asSequence()
            .filter { it > 50 }
            .take(1000)
            .map { it * 2 }
            .sum()
    }

    println("Non-Lazy $msNonLazy ms, Result: $sum")
    println("Lazy $msLazy ms, Result: $lazySum")

//    val seq = generateSequence(1, { it + 1 })
//    println(seq.take(10).toList())

}