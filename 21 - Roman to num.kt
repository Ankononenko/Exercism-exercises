object RomanNumerals {
    fun value(n: Int): String {
        val romanNumsMap: Map<Int, String> = mapOf<Int, String>(1000 to "M", 900 to "CM", 500 to "D", 400 to "CD", 100 to "C", 90 to "XC",
            50 to "L", 40 to "XL", 10 to "X", 9 to "IX", 5 to "V", 4 to "IV", 1 to "I")
        var stringToReturn: String = ""
        var remainder: Int = n
        for ((key, value) in romanNumsMap) {
            stringToReturn += value.repeat(remainder / key)
            remainder -= key * (remainder / key)
        }
        return stringToReturn
    }
}
fun main() {
    println(RomanNumerals.value(1991))
    println(RomanNumerals.value(1990))
    println("Empty space")
    println(RomanNumerals.value(19))
    println(RomanNumerals.value(5))
    println(RomanNumerals.value(4))
    println(RomanNumerals.value(9))
    println(RomanNumerals.value(2000))
    println(RomanNumerals.value(2008))
}
