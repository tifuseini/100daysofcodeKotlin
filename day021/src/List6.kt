open class Item(
    val name: String,
    val price : Int
)

class Noodles : Item("Noodles",10){
    override fun toString(): String {
        return name
    }
}

class Vegetables(vararg val toppings:String) : Item("Vegetables",5){
    override fun toString(): String {
        if (toppings.isEmpty()){
            return "$name Chef's Choice"
        } else {
            return name + ":"+ toppings.joinToString()
        }
    }
}

class Order(val orderNumber: Int){
    private val itemList = mutableListOf<Item>()

    fun addItem(newItem: Item){

    }

    fun addAll(newItems: List<Item>){

    }

    fun print(){

    }
}



fun main() {

//    val noodles = Noodles()
//    val vegetables = Vegetables("Cabbage", "Sprouts", "Onion")
//    val vegetables3 = Vegetables()
//    println(noodles)
//    println(vegetables)
//    println(vegetables3)

    val ordersList = mutableListOf<Order>()
    val order1 = Order(1)
    order1.addItem(Noodles())
    ordersList.add(order1)

    var order2 = Order(2)
    order2.addItem(Noodles())
    order2.addItem(Vegetables("Pepper"))
    ordersList.add(order2)

    val order3 = Order(3)
    order3.addItem(Noodles())
    order3.addItem(Vegetables())
    ordersList.add(order3)

    val order4 = Order(4)
    val items = listOf(Noodles(), Vegetables("Carrots", "Beans", "Celery"))
    order4.addAll(items)
    ordersList.add(order4)



}