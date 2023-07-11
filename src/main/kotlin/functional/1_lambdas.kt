package functional

fun main() {
//    val timesTwo: (Int) -> Int = { x: Int -> x * 2 }
    val timesTwo = { x: Int -> x * 2 }
//    val add : (Int, Int)-> Int = { x: Int, y: Int -> x + y }
    val add = { x: Int, y: Int -> x + y }

    val list = (1..100).toList()
    println(list.filter { elementOfList -> elementOfList % 2 == 0 })

    println(list.filter { it % 2 == 0 })//we can just use 'it' when we only have one lambda expression

    println(list.filter { it.even() })

    println(list.filter(::isEven))


}

fun Int.even() = this % 2 == 0
fun isEven(i: Int) = i % 2 == 0