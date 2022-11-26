enum class Color {
    BLACK, BROWN, RED, ORANGE, YELLOW, GREEN, BLUE, VIOLET, GREY, WHITE
}
object ResistorColorDuo {
    fun value(vararg colors: Color): Int {
        var listToAddTo: List<String> = mutableListOf()
        for (color in colors) {
            listToAddTo = listToAddTo + when (color) {
                Color.BLACK -> "0"
                Color.BROWN -> "1"
                Color.RED -> "2"
                Color.ORANGE -> "3"
                Color.YELLOW -> "4"
                Color.GREEN -> "5"
                Color.BLUE -> "6"
                Color.VIOLET -> "7"
                Color.GREY -> "8"
                Color.WHITE -> "9"
            }
        }
        val stringToReturn: String = (listToAddTo[0] + listToAddTo[1])
        return stringToReturn.toInt()
    }
}

