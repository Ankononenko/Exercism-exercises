class Anagram (val wordToFindAnagramOf: String = String()) {

    fun match(anagrams: List<String>): List<String> {

        val listToReturn = mutableListOf<String>()

        if (anagrams.isEmpty() || (anagrams.size == 1 && anagrams[0] == wordToFindAnagramOf))
            return emptyList()
        else if(anagrams.isNotEmpty() && anagrams.size != 1) {
            for (word in anagrams) {
                if (word.lowercase().toCharArray().sorted() == wordToFindAnagramOf.lowercase().toCharArray().sorted())
                    listToReturn += word
            }
        }
        println(listToReturn)
        return listToReturn
    }
}

fun main () {
    val callTheAnagram = Anagram("Anton")
    callTheAnagram.match(listOf("Naton", "Nata", "Tonan"))
}
