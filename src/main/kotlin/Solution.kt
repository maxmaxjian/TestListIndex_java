
fun main(args: Array<String>) {

    val list = listOf(1,2,3)
    println("Order:")
    for (i in list.indices) {
        print("$i ")
    }
    println()

    println("Reverse order:")
    for (j in list.indices.reversed()) {
        print("$j ")
    }
}
