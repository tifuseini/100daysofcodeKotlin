open class Humans {
    open val name = ""
    open val age = 0
    open val tribe = ""
    open val color =""
    var eye = 2

    open fun sayMyName(){
        println("My Name is $name")
    }

    open fun hoeOld(){
        println("I am $age years old")
    }
}

class White : Humans(){
    override val name = "Chris Evans"
    override val age = 30
    override val tribe = "Americn"
    override val color = "White"

    override fun sayMyName() {
        println("My Name is $name")
    }

    override fun hoeOld(){
        println("I am $age years old")
    }

}

class Black : Humans(){
    override val name = "Idris Elba"
    override val age = 30
    override val tribe = "African"
    override val color = "Black"
    val movie = "Hobbs And Shaw"

    override fun sayMyName() {
        println("My Name is $name")
    }

    override fun hoeOld(){
        println("I am $age years old")
    }

    fun favMovie(){
        println("My favorite movie is $movie")
    }


}
fun main() {
    val b = Black()
    b.sayMyName()
    b.favMovie()
}