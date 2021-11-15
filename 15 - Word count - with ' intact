object WordCount {
    fun phrase(phrase: String): Map<String, Int> {
        val transformedString: List<String> = phrase.toLowerCase().replace("[^A-Za-z0-9']".toRegex(), " ").split(" ")
        val transformedWithoutSpaces: List<String> = transformedString.filter { it.isNotBlank() }
        var index = 0
        val mapToPopulateAndReturn = mutableMapOf<String, Int>()
        for (word in transformedWithoutSpaces) {
            if (word == transformedWithoutSpaces[index]) {
                mapToPopulateAndReturn.merge(word, 1, Int::plus)
            }
            index++
        }
        println(transformedWithoutSpaces)
        return mapToPopulateAndReturn
    }
}
fun main() {
    val callWordCount = WordCount
    println(callWordCount.phrase(""""\"That's the password: 'PASSWORD 123'!\", cried the Special Agent.\\nSo I fled.
        |sd
        |sd
        |gg
    """.trimMargin()))
}
