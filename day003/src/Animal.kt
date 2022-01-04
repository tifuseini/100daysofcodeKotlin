open class Animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10

    open fun makeNoise(){
        println("This Animal is making noise")
    }

    open fun eat(){
        println("The Animal is eating")
    }

    open fun roam(){
        println("The Animal is roaming")
    }

    fun sleep(){
        println("The  Animal is sleeping")
    }
}

class Hippo : Animal() {

    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat(){
        println("The Hippo is eating $food")
    }

}

open class Canine : Animal() {
    override fun roam() {
        println("The canine is roaming")
    }
}

class Wolf : Canine(){
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hooooooowwl")
    }

    override fun eat() {
        println("The wolf is eating $food")
    }
}

open class Feline : Animal(){
    override fun roam() {
        println("The feline is roaming")
    }
}

class Lion : Feline(){

}
fun main() {
    val l = Lion()
    l.roam()
}