fun main() {

    if (2>1){
        println("Yes, 2 is greater than 1. ")
    }

    val animal = "Fox"

    if (animal == "Cat" || animal == "Dog"){
        println("Animal is a house pet.")
    } else {
        println("Animal is not a house pet")
    }



    var hoursWorked = 45
    var price = 0
    if (hoursWorked > 40) {
        val hoursOver40 = hoursWorked - 40
        price += hoursOver40 * 50
        hoursWorked -= hoursOver40
    }
    price += hoursWorked * 25
    println(price)

    val myAge = 18
    if (myAge > 13 && myAge < 19){
        println("Teenager")
    } else {
        println("Not a Teenager")
    }
}