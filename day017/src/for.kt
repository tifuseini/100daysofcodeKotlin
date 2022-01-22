fun main() {

    val closedRange = 0..5
    println(closedRange)

    val halfOpenRange = 0 until 5
    println(halfOpenRange)

    val decreasingRange = 5 downTo 0
    println(decreasingRange)

    val count = 10

    var sum = 0
    for(i in 1..count){
        sum += 1
        print(sum)


    }

    var sum1 = 0
    for(i in 1 until count){
        sum1 += 1
        print(sum1)
    }
}





