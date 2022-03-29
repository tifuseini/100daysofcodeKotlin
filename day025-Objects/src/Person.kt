class Person (var firstName:String,var lastName:String) {

    val fullname:String

    init {
        fullname = "$firstName $lastName"
    }


    override fun toString(): String {
        return fullname
    }
}

fun main() {
    // Create a new person
    val brian = Person("Brian", "Truesby")
    println(brian)
    // Create another person
    val rose = Person("Rose", "Bushnell")
    println(rose)
    // Change Rose's last name
    rose.lastName = "Bushnell-Truesby"
    println(rose)
}