import kotlin.math.pow
object ArmstrongNumber {
    fun check(input: Int): Boolean {
        val StringToOperateOn: String = input.toString()
        var sumToReturn: Double = 0.0
        for (number in StringToOperateOn) {
            sumToReturn += number.toString().toDouble().pow(StringToOperateOn.length)
        }
        return input.toDouble() == sumToReturn
    }
}
fun main() {
    println(ArmstrongNumber.check(10))
    println(ArmstrongNumber.check(11))
    println(ArmstrongNumber.check(1))
    println(ArmstrongNumber.check(22))
    println(ArmstrongNumber.check(9))
    println(ArmstrongNumber.check(153))
    println(ArmstrongNumber.check(154))
}
