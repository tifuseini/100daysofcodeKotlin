class Person (val firstName:String,val lastName:String) {

    override fun toString(): String {
        return "$firstName $lastName "
    }
}

fun main() {

    val Brain = Person("Brain","Truesby")
    println(Brain.toString())
}