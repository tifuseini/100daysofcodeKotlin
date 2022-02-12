fun main() {

    // Arrayd
    // Creating Array
    val evenNumber = arrayOf(1,2,34,60)
    println(evenNumber[1])
    val names = arrayOf("Kofi","Yaw")
    println(names[1])

    // Arrays of Primitive Types
    val oddNumber = intArrayOf(1,3,5,7)
    val zeros = DoubleArray(5)

    // Lists
    val regions = listOf("Northern","Eastern","Greater Accra")
    println(regions)

    // Mutable Lists
    val towns = mutableListOf("Accra","Kumasi","Cape Coast")
    println(towns)

    // Accessing Properties
    println(regions.isEmpty())
    println(towns.isEmpty())

    println(regions.size)
    println(towns.size)

    val newTown = towns.last()
    println(newTown)
    val newRegion = regions.last()
    println(newTown)

    // Using Index
    val firstTown = towns[0]
    println(firstTown)
    val firstRegion = regions.get(0)
    println(firstRegion)




}



