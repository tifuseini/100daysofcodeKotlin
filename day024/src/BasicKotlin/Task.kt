package BasicKotlin

class Task(
    val name: String,_priority:Int = DEFAULT_PRIORITY
) {

    companion object{
        const val MIN_PRIORITY = 1
        const val MAX_PRIORITY = 5
        const val DEFAULT_PRIORITY = 3
    }

    //Property with custom setter
    var priority = validPRIORITY(_priority)
    set(value) {
        field = validPRIORITY(value)
    }

    //Private validation function
    private fun validPRIORITY(p:Int)=
        p.coerceIn(MIN_PRIORITY, MAX_PRIORITY)
}