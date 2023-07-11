package functional

fun main() {
//    val list = (1..1000).toList()
    val list = generateSequence(0) {
        println("Calculating ${it + 10} ")
        it + 10 } //it generates an infinite loop
    println(list.take(5).toList())
    println(list.take(10).toList())

}