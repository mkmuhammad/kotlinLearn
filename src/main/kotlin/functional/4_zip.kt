package functional

fun main() {
    val list = listOf("hi", "there", "kotlin", "fans")
    val containsTLetter = listOf(false, true, true, false)

    //pair(String,Boolean>
    val zipped: List<Pair<String, Boolean>> = list.zip(containsTLetter)
    val mapping = list.zip(list.map { it.contains("t") })
}