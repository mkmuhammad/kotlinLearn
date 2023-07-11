package functions

import java.util.*

fun main(args: Array<String>) {
    helloWorlds()
    printWithSpaced("Kotlin is awesome!")
    println()
    println(getCurrentDate())
    println(max(17, 42))
}

fun printWithSpaced(text: String) {
    for (char in text) {
        print("$char ")
    }

}

fun helloWorlds() {
    println("hello World")
}

fun getCurrentDate(): Date {
    return Date()
}

fun max(a: Int, b: Int): Int {
    return if (a >= b) {
        a
    } else {
        b
    }
}