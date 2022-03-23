package BasicKotlin

data class Person(
    val first:String,
    val middle:String?,
    val last:String
)

fun main() {

    val jkRowling = Person("Jonne",null,"ROwlings")
    val northWest = Person("North",null,"West")
    val tifuseini = Person("Tahiru","Iddrisu","Fuseini")

    println(jkRowling)
    println(northWest)
    println(tifuseini)

}