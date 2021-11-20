object ResistorColorTrio {
    fun text(vararg input: Color): String {
        var stringToReturn: String = ""
        var index: Int = 0
        repeat(2) {
            stringToReturn += input[index].ordinal
            index++
        }
        repeat(input[2].ordinal) {
                stringToReturn += "0"
            }
        return ("$stringToReturn ohms")
    }
}
fun main () {
    println(ResistorColorTrio.text(Color.ORANGE, Color.ORANGE, Color.BLACK))
    println(ResistorColorTrio.text(Color.ORANGE, Color.ORANGE, Color.RED))
}