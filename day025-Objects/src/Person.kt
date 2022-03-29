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

    val tahiru = Person("Tahiru","Fuseini")
    println(tahiru)

    val Brain = Person("Brain","Truesby")
    println(Brain.toString())
    print(Brain)

    // Setter and Getter
    // Creat e a new Person

    val wise = Person("wise","Zoddah")
    println(wise.firstName)

}