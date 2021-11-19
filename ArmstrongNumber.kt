object ArmstrongNumber {
    fun check(input: Int): Boolean {
        val stringToOperateOn: String = input.toString()
        var sumToReturn: Int = 0
        for (number in stringToOperateOn) {
            sumToReturn += number.toInt() * stringToOperateOn.length
        }
        return input == sumToReturn
    }
}
fun main() {
    println(ArmstrongNumber.check(10))
    println(ArmstrongNumber.check(11))
    println(ArmstrongNumber.check(1))
    println(ArmstrongNumber.check(22))
    println(ArmstrongNumber.check(9))
    println(ArmstrongNumber.check(153))
}