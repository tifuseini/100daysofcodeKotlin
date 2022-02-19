fun printMyName(){
    println("My name is Tahiru Fuseini")
}

fun printMultipleOf(multiplier: Int , andValue:Int){
    println("$multiplier * $andValue = ${multiplier * andValue}")
}

fun printMultiple(multiplier: Int,andValue: Int = 1){
    println("$multiplier * $andValue = ${multiplier * andValue}")
}

fun multiply(number: Int,multiplier: Int): Int{
    return number * multiplier
}
val num = multiply(40,90)

fun multiplyAndDivide(number: Int,factor:Int):Pair<Int,Int>{
    return Pair(number * factor ,number / factor,)
}

fun incrementAndPrint(value: Int) : Int {
    val newValue = value + 1
    print(newValue)
    return newValue
}

fun getValue(value:Int):Int{
    return value + 1
}

fun getValue(value: String): String{
    return "The value is $value"
}

fun add(a:Int , b:Int):Int{
    return a + b
}

fun infiniteLoop():Nothing{
    while (true){

    }
}


fun main() {
    printMyName()
    printMultipleOf(2, 5)
    printMultiple(6)
    printMultiple(3, 5)
    println(num)
    val get1 = getValue(1)
    val get2 = getValue("Tahiru")
    println("$get1 and $get2")
    val value2 = incrementAndPrint(30)
    println(value2)
    var function = ::add
    val newFunction = function(2,3)
    println(newFunction)
}