enum class Color(number: Int) {
    BLACK(0),
    BROWN(1),
    RED(2),
    ORANGE(3),
    YELLOW(4),
    GREEN(5),
    BLUE(6),
    VIOLET(7),
    GREY(8),
    WHITE(9)
}

object ResistorColorDuo {
    fun value(vararg colors: Color): Int {
        val listOfColors = mutableListOf<Color>()
        for (colorFollowing in colors)
            listOfColors += colorFollowing
        val numberToReturn = (listOfColors[0].number.toString() + listOfColors[1].number.toString()).toInt()
        return numberToReturn
    }
}

fun main(){
    val callTheShit = ResistorColorDuo
    callTheShit.value(Color.BLACK, Color.BROWN, Color.YELLOW)
}
