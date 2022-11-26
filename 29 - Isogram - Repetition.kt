object Isogram {
    fun isIsogram(phrase: String) = phrase.lowercase().toSet().joinToString("") == phrase.lowercase()
}
fun main() {
    println(Isogram.isIsogram("Issogram"))
    println(Isogram.isIsogram("Isogram"))
}
