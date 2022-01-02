class Drumkit (var hasTopHat:Boolean,var hasSnare:Boolean){
    fun playTopHat(){
        if (hasTopHat) println("ding ding be-be-bing")
    }

    fun playSnare(){
        if (hasSnare) println("bang bang bang!")
    }
}

fun main() {
    val Drum = Drumkit(true,true)

    Drum.playTopHat()
    Drum.playSnare()

    Drum.hasSnare = false
    Drum.playTopHat()
    Drum.playSnare()

}