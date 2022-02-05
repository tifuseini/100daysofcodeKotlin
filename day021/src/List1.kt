fun main() {

    val number:List<Int> = listOf(1,2,3,4,5,6)

    val number2 = listOf<Int>(1,2,3,4,5,6,6)

    val number3 = listOf(1,2,3,4,5,6,7)

    println("List : $number3")
    println("Size : ${number3.size}")
    println("${number3.lastIndex}")
    println("${number3.indices}")
    println("${number3.indexOf(3)}")
    println("${number3[2]}")
    println("First Index : ${number3.first()}")
    println("Last Index : ${number3.last()}")
    println("Contains 3 : ${number3.contains(3)}")
    println("Contains 10 : ${number3.contains(10)}")

}