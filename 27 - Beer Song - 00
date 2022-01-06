object BeerSong {
    fun verses(startBottles: Int, takeDown: Int){
        for (bottle in startBottles downTo takeDown) {
            if (bottle > 1) {
                println("""
                    $bottle bottles of beer on the wall, $bottle bottles of beer.
                    Take one down and pass it around, ${bottle - 1} bottles of beer on the wall.
                """.trimIndent())
            }
            else { println("""
                    $bottle bottle of beer on the wall, $bottle bottle of beer.
                    Take one down and pass it around, ${bottle - 1} bottles of beer on the wall.
                """.trimIndent())
        }
    }
}
}
fun main() {
    val callTheBeerSong = BeerSong
    callTheBeerSong.verses(99, 1)
}
