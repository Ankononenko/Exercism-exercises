object Raindrops {
    fun convert(n: Int): String {
        val result = when {
            n % 3 == 0 && n % 5 == 0 && n % 7 == 0 -> "PlingPlangPlong"
            n % 3 == 0 && n % 5 == 0 -> "PlingPlang"
            n % 3 == 0 && n % 7 == 0 -> "PlingPlong"
            n % 5 == 0 && n % 7 == 0 -> "PlangPlong"
            n % 3 == 0 -> "Pling"
            n % 5 == 0 -> "Plang"
            n % 7 == 0 -> "Plong"
            else -> n.toString()
        }
        return result
    }
}
fun main(){
    println(Raindrops.convert(35))
    // PlangPlong
    println(Raindrops.convert(30))
    // PlingPlang
    println(Raindrops.convert(2))
    // "2"
    println(Raindrops.convert(3))
    // Pling
    println(Raindrops.convert(77))
    // Plong
}
