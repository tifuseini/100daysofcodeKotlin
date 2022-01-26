fun main() {


    val entrees = mutableListOf<String>()
    entrees.add("noodles")
    entrees.add("spagetti")
    val moreItem = listOf<String>("rice","rice1","rice2")
    entrees.addAll(moreItem)
    entrees.add("10")
    entrees.remove("10")
    entrees.removeAt(0)


    println("Entrees: $entrees")
}