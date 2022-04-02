package person

class Person(_firstName : String,_lastName:String,
            _height:Double,_age:Int,_hasPartner:Boolean) {

    var firstName:String = _firstName
    var lastName :String = _lastName
    var height: Double = _height
    var age: Int = _age
    var hasPartner: Boolean = _hasPartner

    fun fullName():String{
        return  "$firstName $lastName"
    }

    override fun toString(): String {
        return fullName()
    }
}