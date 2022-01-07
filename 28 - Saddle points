data class MatrixCoordinate(val row: Int, val col: Int)
class Matrix(val rows: List<List<Int>>) {
    val cols: List<List<Int>> = (0..rows.first().size - 1).mapIndexed {
            i, _ ->
        rows.map { it[i] }
    }
    val points: List<MatrixCoordinate> = (0..rows.size - 1).mapIndexed {
            i, _ ->
        (0..cols.size - 1).map { MatrixCoordinate(i + 1, it + 1) }
    }.flatten()
    val saddlePoints: Set<MatrixCoordinate> = points.filter { isSaddlePoint(it) }.toSet()
    private fun isSaddlePoint(point: MatrixCoordinate): Boolean {
        return rows[point.row - 1][point.col - 1] == rows[point.row - 1].maxOrNull() &&
                rows[point.row - 1][point.col - 1] == cols[point.col - 1].minOrNull()
    }
}
