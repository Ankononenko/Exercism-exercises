object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        var placeToStart: Int = 0
        var hammingDistance: Int = 0
        for(leftLetter in leftStrand){
                if (leftLetter != rightStrand[placeToStart])
                    hammingDistance++
                    placeToStart++
                if (leftStrand.toList().size != rightStrand.toList().size){
                    throw IllegalArgumentException("left and right strands must be of equal length")
                }
        }
        return  hammingDistance
    }
}

fun main(){
    println(Hamming.compute("GAGCCTACTAACGGGAT", "CATCGTAATGACGGCCT"))
}
