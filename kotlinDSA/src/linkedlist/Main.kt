package linkedlist

fun main() {
    println("Creating and linking nodes")
    val node1 = Node(value = 1)
    val node2 = Node(value = 2)
    val node3 = Node(value = 3)
    val node4 = Node(value = 4)

    node1.next = node2
    node2.next = node3
    node3.next = node4

    println(node1)

    println(node3)
 }