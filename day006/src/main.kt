
val shopping = listOf("Tea","Coffe","Milk")

fun main() {
    if (shopping.size > 0){
        println(shopping.get(1))
    }

    for (me in shopping)
        print(me)

    if (shopping.contains("Tea")){
        println(shopping.indexOf("Tea"))
    }

}