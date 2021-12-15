enum class Color {
    BLACK, BROWN, RED, ORANGE, YELLOW, GREEN, BLUE, VIOLET, GREY, WHITE
}

object ResistorColorTrio {
    fun text(vararg input: Color): String {

        var stringToReturn = String()
        var index: Int = 0

        repeat(2) {
            stringToReturn += input[index].ordinal
            index++
        }

        val ohmsEnding = when(input[2]){
            Color.BLACK-> " ohms"
            Color.BROWN-> "0 ohms"
            Color.RED-> "00 ohms"
            Color.ORANGE-> " kiloohms"
            Color.YELLOW-> "0 kiloohms"
            Color.GREEN-> "00 kiloohms"
            Color.BLUE-> " megaohms"
            Color.VIOLET-> "0 megaohms"
            Color.GREY-> "00 megaohms"
            Color.WHITE-> " gigaohms"
        }

        return stringToReturn + ohmsEnding
    }
}
