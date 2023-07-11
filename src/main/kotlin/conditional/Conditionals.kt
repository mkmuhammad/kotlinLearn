package conditional

fun main(args: Array<String>) {
    val mode = 2

    val result = when (mode) {
        1 -> "the mode is lazy"
        2 -> {
            "the mode is 2"
            "so the mode is busy"
        }

        3 -> "the mode is super productive"
        else -> "i don't know the mode"
    }
    println(result)

    val x = 5
    when (x) {
        5 -> println("x is 5")
        3 * 12 -> println("x is 3*12")
        "hey there".length -> println("x is length of the string 'hey there' ")
        in 1..10 -> println("x is between 1 and 10")
        !in 1..9 -> println("x is not between 1 to 9")
        in 12 downTo 1 -> println("x is between 12 and 1")
        12, 2, 1 -> println("x is 12,2,1")
    }

    val temp = 10
    val isHot =
        if (temp > 50) true else false //in kotlin everything is an expression even the result of if bloc and you can use it like:

    val message = "This is a ${if (isHot) "hot" else "not hot"} Fish"
    println(message)


    val y: Any = 13.32
    when (y) {
        is Int -> println("y is an integer")
        is Double -> println("y is a double")
        is String -> println("y is a string")
        else -> println("y is of unknown type")
    }
}