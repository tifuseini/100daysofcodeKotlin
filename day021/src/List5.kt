fun main() {

    val names = listOf<String>("Jessica","Henry","Alicia","Jose")

    for (name in names){
        println("First Name : $name")
        println("$name - Number of characters : ${name.length}")
    }
}