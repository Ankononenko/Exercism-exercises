object Acronym {
    fun generate(phrase: String) : String {
        var acronym: String = ""
        val phraseList: List<String> = phrase.split(" ", "-" ).map { it.trim() }
        word@ for (word in phraseList) {
            letter@ for (letter in word) {
                if (letter.isLetter()) {
                    acronym += letter.toUpperCase()
                    break@letter
                }
            }
        }
        println(acronym)
        return acronym
    }
}
fun main(){
    Acronym.generate("Anton Kononenko")
    Acronym.generate("55Anton 88Kononenko")
    Acronym.generate("Portable Network Graphics")
    Acronym.generate("First In, First Out")
    Acronym.generate("GNU Image Manipulation Program")
    Acronym.generate("Complementary metal-oxide semiconductor")
    Acronym.generate("Rolling On The Floor Laughing So Hard That My Dogs Came Over And Licked Me")
    Acronym.generate("Something - I made up from thin air")
    Acronym.generate("Halley's Comet")
    Acronym.generate("The Road _Not_ Taken")
}
