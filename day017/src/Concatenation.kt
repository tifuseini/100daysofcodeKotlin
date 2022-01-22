fun main() {
    val kitty = "Ct"

    var message = "Hello "+ "my name is "
    val name = "Joe"
    message += name
    println(message)

    val exclamationMark = "!"
    message += exclamationMark
    println(message)

    message = "Hello my name is $name!"
    println(message)

    val onethird = 1.0/3.0
    val onethirdString = "One third is $onethird as a decimal"
    println(onethirdString)

    val bigString = """
        |You can have a string 
        |that contains multiple 
        |lines
        |by
        |doing this.
    """.trimIndent()

    println(bigString)

    val bigString2 = """
        |You can have a string 
        |that contains multiple 
        |lines
        |by
        |doing this.
    """.trimMargin()

    println(bigString)

    val firstName:String = "Tahiru Fuseini"
    val lastName:String = " Iddrisu"

    val fullName:String = firstName + lastName

    val myDetails:String = "Hello my name is $fullName."

    println(myDetails)
}