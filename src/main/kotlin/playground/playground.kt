package playground

fun main(args: Array<String>) {
    feedTheFish()
    println(randomDay())
}

fun feedTheFish(): Unit {
    val day = "Tuesday"
    val food = "pellets"
    println("Today is $day and the fish eat $food")

}

fun randomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Math.random().toInt() % 7]
}