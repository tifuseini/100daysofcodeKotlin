fun main() {
    val guestsPerFamily = listOf(2,4,1,3)

    var totalGuest = 0

    var index = 0

    while (index < guestsPerFamily.size){
        totalGuest += guestsPerFamily[index]
        index++

    }

    println("Total Guest Count : $totalGuest")
}