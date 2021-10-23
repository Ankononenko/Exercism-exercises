class Triangle<out T : Number>(val a: T, val b: T, val c: T) {

    val isEquilateral: Boolean = a == b && a == c && b == c
    val isIsosceles: Boolean = a == b || a == c || b == c
    val isScalene: Boolean = a != b && a != c && b != c

}

fun main(){
    val callTheTriangleOne = Triangle(5, 5, 5)
    println(callTheTriangleOne.isEquilateral)
    println(callTheTriangleOne.isIsosceles)
    println(callTheTriangleOne.isScalene)
    val callTheTriangleTwo = Triangle(5, 5, 3)
    println(callTheTriangleTwo.isEquilateral)
    println(callTheTriangleTwo.isIsosceles)
    println(callTheTriangleTwo.isScalene)
    val callTheTriangleThree = Triangle(1, 2, 3)
    println(callTheTriangleThree.isEquilateral)
    println(callTheTriangleThree.isIsosceles)
    println(callTheTriangleThree.isScalene)
}
