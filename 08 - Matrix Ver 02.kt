class Matrix(matrixAsString: String) {
    private val matrix = matrixAsString.lines().map {it.trim(). split("\\s+".toRegex()).map(String::toInt)}
    fun column(colNr: Int): List<Int> = matrix.map{ it[colNr - 1]}
    fun row(rowNr: Int): List<Int> = matrix[rowNr - 1]
}

fun main(){
    val matrixAsString = "1 2 3\n4 5 6\n7 8 9"
    val columnIndex = 2
    val rowIndex = 3
    println(Matrix(matrixAsString).column(columnIndex))
    //println(Matrix(matrixAsString).row(rowIndex))

    /**val matrixAsString = """
            1 2 3
            4 5 6
            7 8 9
            """.trimIndent()
    val columnIndex = 3
    val expectedColumn = listOf(3, 6, 9)
    println(Matrix(matrixAsString).column(columnIndex))
    **/

    /**val matrixAsString = "1 2\n3 4"
    val columnIndex = 2
    println(Matrix(matrixAsString).column(columnIndex))
    **/
}
