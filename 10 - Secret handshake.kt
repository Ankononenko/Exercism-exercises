enum class Signal {

  WINK, DOUBLE_BLINK, CLOSE_YOUR_EYES, JUMP

}

object HandshakeCalculator {
    fun calculateHandshake (number: Int): List<Signal> {
        val numberToBinary = number.toString(2)
        val listToReturn = mutableListOf<Signal>()
        numberToBinary.forEachIndexed{index, char ->
            if(char.equals('1')) when(index) {
                0 -> listToReturn.add(Signal.WINK)
                1 -> listToReturn.add(Signal.DOUBLE_BLINK)
                2 -> listToReturn.add(Signal.CLOSE_YOUR_EYES)
                3 -> listToReturn.add(Signal.JUMP)
                4 -> listToReturn.reverse()
            }
        }
        return listToReturn
    }
}
fun main(){
    println(HandshakeCalculator.calculateHandshake(3))
    println(HandshakeCalculator.calculateHandshake(5))
    println(HandshakeCalculator.calculateHandshake(19))
}
