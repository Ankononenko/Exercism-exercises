object Transpose {

    fun getLongestWordLength(input: List<String>) = input.maxByOrNull { it.length }?.length ?: 0

    fun transpose(input: List<String>): List<String> {
        val rows = input.size
        val columns = getLongestWordLength(input)
        return (0..columns - 1).map { column ->
            (0..rows - 1).map { row ->
                input[row].getOrNull(column) ?:
                when (column < getLongestWordLength(input.drop(row + 1))) {
                    true -> " "
                    false -> ""
                }
            }
        }
            .map { it.joinToString("") }
    }
}

fun main() {
    println(Transpose.transpose(listOf("First", "Second")))
}
