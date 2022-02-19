fun fibonacci(number:Int):Int{
    if (number <= 0){
        return 0
    }

    if(number == 1 || number == 2){
        return  1
    }

    return fibonacci(number - 1) + fibonacci(number -2)
}

fun main() {
    println(fibonacci(0))
    println(fibonacci(1))
    println(fibonacci(2))
    println(fibonacci(10))

}