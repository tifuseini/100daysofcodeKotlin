package BasicKotlin

class Task(
    val name: String,_priority:Int = DEFAULT_PRIORITY
) {

    companion object{
        const val MIN_PRIORITY = 1
        const val MAX_PRIORITY = 5
        const val DEFAULT_PRIORITY = 3
    }

}