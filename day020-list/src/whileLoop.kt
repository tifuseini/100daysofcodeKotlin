fun main() {
    val guestsPerFamily = listOf(2,4,6,8)
    var totalGuests = 0
    var index = 0

    while (index < guestsPerFamily.size){
        totalGuests += guestsPerFamily[index]
        index++
    }

    println(totalGuests)

}

