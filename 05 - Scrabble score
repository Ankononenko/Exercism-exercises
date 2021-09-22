fun countScrabbleScore(wordToCount: String): Int {

    val treasureMap = mapOf<String, Int>(
        "A" to 1, "E" to 1, "I" to 1, "O" to 1, "U" to 1, "L" to 1, "N" to 1, "R" to 1, "S" to 1, "T" to 1,
        "D" to 2, "G" to 2,
        "B" to 3, "C" to 3, "M" to 3, "P" to 3,
        "F" to 4, "H" to 4, "V" to 4, "W" to 4, "Y" to 4,
        "K" to 5,
        "J" to 8, "X" to 8,
        "Q" to 10, "Z" to 10
    )

    var countResult: Int = 0

    for(letter in wordToCount)
        countResult += treasureMap.getValue("${letter.toUpperCase()}")

    return countResult
}

fun main(){
    println(countScrabbleScore("Anton"))
    println(countScrabbleScore("a") == 1)
    println(countScrabbleScore("A") == 1)
    println(countScrabbleScore("f") == 4)
    println(countScrabbleScore("at") == 2)
    println(countScrabbleScore("zoo") == 12)
    println(countScrabbleScore("street") == 6)
    println(countScrabbleScore("quirky") == 22)
    println(countScrabbleScore("OxyphenButazone") == 41)
    println(countScrabbleScore ("pinata") == 8)
    println(countScrabbleScore("") == 0)
    println(countScrabbleScore("abcdefghijklmnopqrstuvwxyz") == 87)
}
