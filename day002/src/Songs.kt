class Song(val title:String , val artist:String){
    fun play(){
        println("Playing the song $title by $artist")
    }

    fun stop(){
        println("Stopped playing $title by $artist")
    }
}

var song = arrayOf(Song("Ye","Burna Boy"),
                    Song("Enter the net","Shatta Wale"))

fun main() {
    song[0].play()
    song[0].stop()
    song[1].play()
    song[1].stop()

}