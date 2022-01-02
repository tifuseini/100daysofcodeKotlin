class Dogs(val name: String,weight_param:Int,breed_param:String){
    init {
        println("Dog $name has been created. ")
    }
    var activities = arrayOf("Walks")
    var breed = breed_param.uppercase()
    init {
        println("The breed is $breed")
    }
    var weight = weight_param
        set(value){
            if (value > 0) field = value
        }

    val weightInKgs:Double
        get() = weight/2.2

    fun bark(){
        println(if (weight < 20) "Yip" else "Woof")
    }
}

fun main() {
    val myDogs = Dogs("Fido",70,"Mixed")
    myDogs.bark()
    myDogs.weight = 75
    println("Weight in KG is ${myDogs.weightInKgs}")
    myDogs.weight=-2
    println("Weight is ${myDogs.weight}")
    myDogs.activities = arrayOf("Walks","Fetching balls","Frisbee")
    for (item in myDogs.activities){
        println("My dog enjoys $item")
    }
    val dogs = arrayOf(Dogs("Kelpie",30,"Westie"),
                        Dogs("Ripper",89,"Poodle"))

    dogs[0].bark()
    println("Weight for ${dogs[0].name} is ${dogs[0].weight}")

    dogs[1].bark()
    dogs[1].weight =16
    println("Weight for ${dogs[1].name} is ${dogs[1].weight}")
}