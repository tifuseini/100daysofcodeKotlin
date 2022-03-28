data class User(
    val firstName:String,
    val lastName: String
)

fun main() {
    val brain = User("Tahiru","Fuseini")
    val rose = User("Naziya","Sadiquw")

    val attendees: MutableList<User> = mutableListOf(brain, rose)

    attendees.forEach{
        user -> println("$user is attending")
    }
}
