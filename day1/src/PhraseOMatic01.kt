fun main() {

    val presidents = arrayOf("Nana Addo Dankwa","John Mahama")
    val politicalParty = arrayOf("NPP","NDC")
    val choice = arrayOf("true","false")

    val arraySize1 = presidents.size
    val arraySize2 = politicalParty.size
    val arraySize3 = choice.size

    val rand1 = (Math.random() * arraySize1).toInt()
    val rand2 = (Math.random() * arraySize2).toInt()
    val rand3 = (Math.random() * arraySize3).toInt()

    val prediction = "${presidents[rand1]} ${politicalParty[rand2]} ${choice[rand3]}"
    println(prediction)
}