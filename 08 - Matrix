class Matrix(private val matrixAsString: String) {

    private fun removeExtraCharactersFromTheString(matrixAsString: String): String{
        var finalNumString = ""
        for(char in matrixAsString){
            if(char in "0123456789")
                finalNumString += char
        }
        return finalNumString
    }

    fun countRowsAndColumnsUsingSqrtOfSize(matrixAsString: String): Int {
        val getTheStringWithNoExtraCharacters = removeExtraCharactersFromTheString(matrixAsString)
        var sqrtToMakeMatrixWith = 0
        var matrixSize = getTheStringWithNoExtraCharacters.toList().size
        var numberToSubstractWith = 1
        while(matrixSize > 0){
            matrixSize -= numberToSubstractWith
            numberToSubstractWith += 2
            sqrtToMakeMatrixWith += 1
        }
        return sqrtToMakeMatrixWith
    }

    fun column(colNr: Int): String {
        var num: Double = 1.0
        val callSqrt = countRowsAndColumnsUsingSqrtOfSize(matrixAsString)
        val getTheStringWithNoExtraCharacters = removeExtraCharactersFromTheString(matrixAsString)
        var floatDivisonResult: Double = 0.0
        var stringToReturn = ""
        for(char in getTheStringWithNoExtraCharacters){
            floatDivisonResult = num / (callSqrt - 1)
            if(floatDivisonResult == colNr.toDouble())
                stringToReturn += char
            if(floatDivisonResult > colNr && floatDivisonResult < (colNr + 1))
                stringToReturn += char
            if(floatDivisonResult == (colNr.toDouble() + 1.0))
                stringToReturn += char
            num += 1
        }
        return stringToReturn
    }

    fun row(rowNr: Int): String {
        val callSqrt = countRowsAndColumnsUsingSqrtOfSize(matrixAsString)
        val getTheStringWithNoExtraCharacters = removeExtraCharactersFromTheString(matrixAsString)
        var stringToReturn = ""
        for(i in getTheStringWithNoExtraCharacters[0]..getTheStringWithNoExtraCharacters[(getTheStringWithNoExtraCharacters.length) - 1] step callSqrt)
            stringToReturn += i
        return stringToReturn
    }
}

fun main(){
    val callTheMatrix = Matrix("1234\n5678\n7894\n1234")
    println(callTheMatrix.countRowsAndColumnsUsingSqrtOfSize("1234\n5678\n7894\n1234"))
    println(callTheMatrix.column(4))
    println(callTheMatrix.row(4))
}
