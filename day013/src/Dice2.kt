class Dice2(val numSides : Int) {

    fun roll() : Int{
       return (1..numSides).random()
    }
}

fun main() {
    val myFirstDice = Dice2(6)
    println("Your ${myFirstDice.numSides} sided " +
            "dice rolled ${myFirstDice.roll()}")

   val mySecondDice = Dice2(27)
    println("Your ${mySecondDice.numSides} sided " +
            "dice rolled ${mySecondDice.roll()}")

    val
}