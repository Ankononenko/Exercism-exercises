object Isogram {
    fun isIsogram(phrase: String) = phrase.toLowerCase()
            .filter(Char::isLetter)
            .let { it.toSet().size == it.length }
}
