package oo


fun main() {

    println(5.isEven())

    val naturals = listOf(2, 5, 11, 3, 8, 2)

    println(naturals.filter { it.isEven() })

}

fun Int.isEven() = (this % 2 == 0)
