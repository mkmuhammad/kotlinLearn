package conditional

fun main() {
    val namesToAges = mapOf(Pair("Peter", 24), Pair("Roger", 42))
    val namesToAge2 = mapOf(
        "Peter" to 24,
        "Roger" to 42
    )

    println(namesToAges == namesToAge2)
    println(namesToAges.keys)
    println(namesToAges.values)
    println(namesToAges.entries)

    val countryToPopulation = mutableMapOf(
        "Germany" to 80_000_000,
        "USA" to 300_000_000
    )
    countryToPopulation["Australia"] = 23_000_000
    countryToPopulation.putIfAbsent("USA",320_000_000) //it doesn't do anything cause it's not absent
    println(countryToPopulation)

    println(countryToPopulation.contains("Australia"))
    println(countryToPopulation.containsKey("France"))
    println(countryToPopulation.containsValue(20_000_000))

    println(countryToPopulation["Germany"]) // =countryToPopulation.get("Germany")
    println(countryToPopulation.getOrDefault("France",0))

    namesToAges.entries.forEach{
        println("${it.key} is ${it.value} years old.")

    }
}