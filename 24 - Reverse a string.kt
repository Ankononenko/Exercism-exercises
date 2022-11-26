import org.junit.Test
import kotlin.test.assertEquals

fun reverse(input: String): String {

    // Solving it manually
    var reversed = String()
    var number = input.length
    repeat(input.length) {
        reversed += input[number - 1]
        number--
    }

    // Or with a function...
    val reversedTwo = input.reversed()
    println(reversedTwo)

    return reversed

}

fun main() {

    println(reverse("Here goes test"))

    val runTests = ReverseStringTest()
    runTests.`empty string`()
    runTests.`single word`()
    runTests.`capitalized word`()
    runTests.`sentence with punctuation`()
    runTests.`palindrome word`()
    runTests.`even-sized word`()
    runTests.`apply twice`()

}

class ReverseStringTest {
    @Test
    fun `empty string`() = assertEquals("", reverse(""))

    @Test
    fun `single word`() = assertEquals("tobor", reverse("robot"))

    @Test
    fun `capitalized word`() = assertEquals("nemaR", reverse("Ramen"))

    @Test
    fun `sentence with punctuation`() = assertEquals("!yrgnuh m'I", reverse("I'm hungry!"))

    @Test
    fun `palindrome word`() = assertEquals("racecar", reverse("racecar"))

    @Test
    fun `even-sized word`() = assertEquals("reward", reverse("drawer"))

    @Test
    fun `apply twice`() {
        val input = "input"
        assertEquals(input, reverse(reverse(input)))
    }
}
