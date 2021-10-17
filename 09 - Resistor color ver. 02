object ResistorColor {

    private val colors = mapOf("black" to 0, "brown" to 1, "red" to 2, "orange" to 3, "yellow" to 4, "green" to 5,
        "blue" to 6, "violet" to 7, "grey" to 8, "white" to 9)

    fun colorCode(input: String): Int {
        return colors.getValue(input)
    }

    fun colors(): List<String> {
        return colors.keys.toList()
    }

}

fun main(){
    println(ResistorColor.colorCode("black"))
    println(ResistorColor.colors())
}
