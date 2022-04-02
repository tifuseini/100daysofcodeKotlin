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

    override fun equals(other: Any?): Boolean {
        if (other is Person){
            return (firstName.equals(other.firstName)) &&
                    (lastName.equals(other.lastName))
        } else{
            return false
        }
    }

    override fun hashCode(): Int {
        return firstName.hashCode() + lastName.hashCode()
    }
}