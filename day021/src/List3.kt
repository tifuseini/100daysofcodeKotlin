fun main() {
    val entrees = mutableListOf<String>()

    println(entrees)

    println("Add noodles : ${entrees.add("noodles")}")
    println(entrees)
    println("Add spaghetti : ${entrees.add("Spaghetti")}")
    println(entrees)

    val moreItems = listOf<String>("ravioli","lasagna","fettuccine")
    println("Add list : ${entrees.addAll(moreItems)}")
    println(entrees)

    println("Remove Spaghetti : ${entrees.remove("spaghetti")}")
    println(entrees)

    println("Remove Item that does not exits : ${entrees.remove("rice")}")
    println(entrees)

    println("Remove First Element: ${entrees.removeAt(0)}" )
    println(entrees)

    entrees.clear()
    println(entrees)

    println("Empty : ${entrees.isEmpty()}")
    println(entrees)


}