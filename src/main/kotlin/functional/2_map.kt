package functional

fun main() {

    //map()
    val list = (1..100).toList()

    println(list.map { element -> element * 2 })
    println(list.map { it * 2 })
    println(list.map { it - list.average() })

    //flatMap()
    val nestedList = listOf(
        (1..10).toList(),
        (11..20).toList(),
        (21..30).toList()
    )
    println(nestedList.map { it.sortedDescending() })
    println("flatmap")
    println(nestedList.flatMap { it.sortedDescending() })
    println(nestedList.flatten().sorted().sortedByDescending { it })
}