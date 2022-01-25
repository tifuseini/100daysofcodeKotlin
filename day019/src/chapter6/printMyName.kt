package chapter6

fun printMyName(){
    println("My name is Tahiru")
}

fun printMultiplesOfFive(value:Int){
    println("$value * 5 = ${value * 5}")
}

fun printMultiplesOf(multiplier:Int,andValue:Int){
    println("$multiplier * $andValue = ${multiplier * andValue}")
}

fun main() {

    printMyName()
    printMultiplesOfFive(90)

}