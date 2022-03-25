package BasicKotlin

data class Person(
    val first:String,
    var middle:String?,
    val last:String
)

fun main() {

    val jkRowling = Person("Jonne",null,"ROwlings")
    val northWest = Person("North",null,"West")
    val tifuseini = Person("Tahiru","Iddrisu","Fuseini")

    println(jkRowling)
    println(northWest)
    println(tifuseini)

    if (northWest.middle == null){
        val middlelenght = northWest.middle?.length
        println(middlelenght)
    } else println("We")



}