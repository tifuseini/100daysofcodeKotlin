package linkedlist

class LinkedList<E>{

    private var head: Node<E>? = null
    private var tail: Node<E>? = null

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

    fun push(value: E):LinkedList<E>{
        head = Node(value = value,next = head)
        if (tail == null){
            tail = head
        }
        size++
        return this
    }

}