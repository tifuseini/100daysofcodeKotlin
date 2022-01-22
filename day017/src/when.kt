fun main() {
    var number = 0

    when(number){
        0 -> println("Zero")
        else -> println("Non- Zero")
    }

    number = 10
    when(number){
        10 -> println("Its ten")
    }

    val string = "Dog"
    when(string){
        "Cat","Dog" -> println("Animal is a house pet")
        else -> println("Animal is not a house pet")
    }


}