package loops

fun main(args: Array<String>) {

    var sum = 0
    for (i in 1..10){
        sum = sum +i
        print("$sum ")
    }
    println()

    val list = listOf("Java", "Kotlin", "Python")

    for (element in list){
        println(element)
    }

    for ((index, value)in list.withIndex()){
        print("for index $index there is element $value& ")
    }
    println()
    //===============================================================

    var x =10
    while (x>=0){
        print(" $x ")
        x--
        if (x == 5)
            break
    }
    println()
    for (c in "python"){
        if ( c == 'o' ){
            break
        }
        print(c)
    }
    println("===========")

    val myList = listOf("Book","Table","laptop")
    for (str in myList){
        if (!str.contains('o')){
            continue
        }
        println(str)
    }

    myOuterLoop@ for (i in 1..10){
        myInnerLoop@ for (j in 1..10){
            if (i - j == 5){
                break@myOuterLoop
            }
            println(" $i - $j")
        }
    }



}