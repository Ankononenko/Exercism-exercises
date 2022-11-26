// Final refactor - made a verbose return type, used when statements instead of if statements, fixed bug is the case of 2 bottles.  

object BeerSong {
    fun verses(startBottles: Int, takeDown: Int): String {
        return (startBottles downTo takeDown).map{ verse(it) }.joinToString("\n")
    }
    fun verse(number: Int): String {
        return when {
            number == 0 -> "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n"
            number == 1 -> "1 bottle of beer on the wall, 1 bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n"
            number in 2..99 -> "$number bottles of beer on the wall, $number bottles of beer.\nTake one down and pass it around, ${number - 1} ${if (number == 2) "bottle" else "bottles"} of beer on the wall.\n"
            else -> "Beer song verse can't be negative or bigger than 99."
        }
    }
}
fun main() {
    val callTheBeerSong = BeerSong
    print(callTheBeerSong.verses(99, 0))
}
