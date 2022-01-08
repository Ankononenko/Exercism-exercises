object Isogram {
    fun isIsogram(phrase: String) = phrase.lowercase()
        .filter(Char::isLetter)
        .let { it.toSet().size == it.length }
}

fun main() {
    println(Isogram.isIsogram("Isogram"))
}
