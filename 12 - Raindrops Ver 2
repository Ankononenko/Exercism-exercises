object Raindrops {
    fun convert(n: Int): String {
        return buildString {
            if (n % 3 == 0) append("Pling")
            if (n % 5 == 0) append("Plang")
            if (n % 7 == 0) append("Plong")
            if (isEmpty()) append(n)
        }
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
