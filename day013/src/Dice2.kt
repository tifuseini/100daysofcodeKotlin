class Dice2 {
    var sides = 6

    fun roll(){
        val randomNumber = (1..6).random()
        println(randomNumber)
    }
}

fun main() {
    val myFirstDice = Dice2()

    println(myFirstDice.sides)
    myFirstDice.roll()
}