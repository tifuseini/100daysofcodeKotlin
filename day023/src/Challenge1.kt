import kotlin.math.sqrt

fun isNumberDivisible(number: Int, divisor:Int):Boolean{
    return number % divisor = 0
}

fun isPrime(number: Int):Boolean{
    if (number < 0 ){
        return false
    }

    if(number <= 3){
        return true
    }

    val doubleNumber = number.toDouble()
    val root = (sqrt(doubleNumber)).toInt()
    for (divisor in 2..root) {
        if (isNumberDivisible(number, divisor)) {
            return false
        }
    }
    return true
}

fun main() {



}