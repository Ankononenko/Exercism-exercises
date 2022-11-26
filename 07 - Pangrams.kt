object Pangram {
    fun isPangram(input: String): Boolean {
        val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        var counter = 0
        for(letter in alphabet){
            if(letter in input.toUpperCase())
                counter++
        }
        return counter == 26
    }
}
fun main(){
    val callTheObject = Pangram
    println(callTheObject.isPangram("The quick brown fox jumps over the lazy dog"))
    println(callTheObject.isPangram("The quick brown fox jumps over thedog"))
    println(callTheObject.isPangram("The quick brown fox jumps over the lazy"))
}
