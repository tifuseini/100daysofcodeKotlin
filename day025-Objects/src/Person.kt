class Person (var firstName:String,var lastName:String) {

    val fullname:String

    init {
        fullname = "$firstName $lastName"
    }


    override fun toString(): String {
        return fullname
    }
}

