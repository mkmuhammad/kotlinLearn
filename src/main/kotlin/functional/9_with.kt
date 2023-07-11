package functional

fun main() {
    val props = System.getProperties()

    with(props){
        list(System.out)
        println(propertyNames().toList())
        println(getProperty("user.home"))

    }
    // without with func -> props.list(System.out) / props.propertyNames().toList() / ...
}