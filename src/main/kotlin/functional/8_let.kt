package functional

import java.io.File
import java.util.*

fun main(args: Array<String>) {


    File("example.txt").bufferedReader().let { reader ->
        if (reader.ready()) {
            println(reader.readLine())
        }
    }

    val str: String? = "kotlin for android"

    str?.let {

        if (str.isNotEmpty()) {
            str.lowercase(Locale.getDefault())
        }
    }

}