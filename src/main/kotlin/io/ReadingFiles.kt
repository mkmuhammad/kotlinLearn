package io

import java.io.File

fun main() {

    var lineNumber = 0
    File("src/inputfile.txt").forEachLine {
        ++lineNumber
        println("readed Line: $lineNumber.$it")

    }

}