package functional

import java.io.FileReader

fun main(args: Array<String>) {

    FileReader("notExits.txt").use{

        val str = it.readText()
        println(str)
        // automatically calls it.close() at the end
    }
}