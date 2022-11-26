object ResistorColor {

    private val colors = mapOf("Black" to 0, "Brown" to 1, "Red" to 2, "Orange" to 3, "Yellow" to 4, "Green" to 5,
        "Blue" to 6, "Violet" to 7, "Grey" to 8, "White" to 9)

    fun colorCode(input: String): Int {
        return colors.getValue(input)
    }

    fun colors(): List<String> {
        return colors.keys.map { it.toLowerCase() }
    }

}

fun main(){
    println(ResistorColor.colorCode("Black"))
    println(ResistorColor.colors())
}
