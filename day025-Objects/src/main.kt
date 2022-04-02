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
        println("It's the same person")
    else
        println("Nope not the same Persom")
}