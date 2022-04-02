import person.Person

fun main() {

    //Create A new Person
    val Tahiru = Person("Tahiru","Fuseini",6.2,21,false)
    println(Tahiru)

    // Create a new Person
    val Iddrisu = Person("Iddrisu","Ali",6.1,21,false)
    println(Iddrisu)

    //Change tahiru lastnAme
    Tahiru.lastName = "Kofi"
    println(Tahiru)

    //Change Iddrisu lastnAme
    Iddrisu.lastName = "DOe"
    println(Iddrisu)

    if (Tahiru.equals(Iddrisu))
        println("Tahiru and Iddrisu are the same")
    else
        println("Tahiru and Iddrisu are not the same")

    val second_tahiru = Person("Tahiru","Fuseini",6.2,21,false)
    if (second_tahiru.equals(Tahiru))
        println("Tahiru and second_tahiru are the same")
    else
        println("Tahiru and second_tahiru are not the same")

    val copy_of_tahiru = Tahiru
    if (copy_of_tahiru.equals(Tahiru))
        println("Tahiru and copy_of_tahiru are the same")
    else
        println("Tahiru and copy_of_tahiru are not the same")

    //Hashcode
    println("Tahiru hascode: ${Tahiru.hashCode()}")
    println("Iddrisu hashcode: ${Iddrisu.hashCode()}")
    println("Second tahiru hashcode : ${second_tahiru.hashCode()}")
    println("Copy of Tahiru hashcode : ${copy_of_tahiru.hashCode()}")
}