fun main() {
    val coordinates:Pair<Int,Int> = Pair(2,3)
    println(coordinates)
    val x1 = coordinates.first
    val y1 = coordinates.second
    println("x1 = $x1 and y1 = $y1")
    val (x,y)= coordinates
    println(x)
    println(y)

    val coordinatesInferred = Pair(2,3)

    val coordinatesWithTo = 2 to 3

    val coordinatesDouble = Pair(2.1,4.6)

    val coordinatesMixed = Pair(2,3.5)

    val coordinates3d = Triple(2,3,1)
    val (x3,y3,z3) = coordinates3d
    println("$x3 , $y3 , $z3")

    val dateNew = Triple(1990,12,17)
    val (year,month,_) = dateNew

    println(dateNew)

}