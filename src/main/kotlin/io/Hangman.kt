package io

import java.util.*

fun main() {
    print("Enter the word you guess: ")
    val word = readLine()
    if (word == null) {
        println("No word given, game ended")
        return
    }

    //to move the input word from user side
    for (i in 1..100) {
        println()
    }

    val letters = word.lowercase(Locale.getDefault()).toCharArray().toHashSet() //Tree -> {'t', 'r', 'e'}
    val correctGuesses = mutableSetOf<Char>()
    var fails = 0

    while (letters != correctGuesses) {
        //print the word that has been guessed so far
        printExploredWord(word, correctGuesses)
        println("\n#Wrong guesses $fails\n\n")

        print("Guess letter: ")
        val input = readLine()

        if (input == null){
            continue
        }else if (input.length != 1){
            println("Please enter one letter")
            continue
        }

        if (word.lowercase(Locale.getDefault()).contains(input.lowercase(Locale.getDefault()))) {
            correctGuesses.add(input[0].toLowerCase())
        } else {
            ++fails
        }
    }
    printExploredWord(word,correctGuesses)
    println("\n#Wrong gusses : $fails\n\n")
    println("Well Done!")

}

fun printExploredWord(word: String, correctGuesses: Set<Char>) {
    for (character in word.lowercase(Locale.getDefault())) {
        if (correctGuesses.contains(character)) {
            print("$character ")
        } else {
            print("_ ")
        }
    }
    println()
}