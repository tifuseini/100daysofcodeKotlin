package linkedlist

class LinkedList<T>{

    private var head: Node<T>? = null
    private var tail: Node<T>? = null

    private var size = 0

    fun isEmpty(): Boolean{
        return size == 0
    }

    override fun toString(): String {
        if (isEmpty()){
            return "Empty List"
        } else {
            return head.toString()
        }
    }

    fun push(value: T):LinkedList<T>{
        head = Node(value = value,next = head)
        if (tail == null){
            tail = head
        }
        size++
        return this
    }



}

fun main(){
    val list = LinkedList<Int>()
    list.push(3)
    list.push(2)
    list.push(1)
    println(list)
}