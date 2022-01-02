import java.util.*

class Dog(val name: String, var weight: Int, val breed_param :String) {
    init {
        println("Dog $name has been created")
    }

    val breed = breed_param.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    init {
        println("The breed is $breed")
    }






    fun bark(){
        println(if (weight < 20) "Yip " else "Woof")
    }



}

var myDog = Dog("Fido",75,"mixed")


var dogs = arrayOf(Dog("Bingo",50,"bull"),Dog("Bruno",29,"Poodle"))



fun main() {


}