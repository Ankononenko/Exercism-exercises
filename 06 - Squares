class Squares (private val number: Int) {
    private var sumOfSquares: Int = 0
    private var squareOfSum: Int = 0

    fun squareOfSum(): Int {
        for(i in 1..number)
            squareOfSum += i
        squareOfSum = squareOfSum * squareOfSum
        return squareOfSum
    }

    fun sumOfSquares(): Int {
        for(i in 1..number)
            sumOfSquares += (i * i)
        return sumOfSquares
    }

    fun difference(): Int {
        val first = squareOfSum()
        val second = sumOfSquares()
        return (first - second)
    }
}

fun main(){
    println(Squares(1).squareOfSum())
    println(Squares(5).squareOfSum())
    println(Squares(100).squareOfSum())
    println(Squares(1).sumOfSquares())
    println(Squares(5).sumOfSquares())
    println(Squares(100).sumOfSquares())
    println(Squares(1).difference())
    println(Squares(5).difference())
    println(Squares(100).difference())
}
