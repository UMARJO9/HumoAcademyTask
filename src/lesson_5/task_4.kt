package lesson_5

fun main(){
    val numberArray = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    println(minSumArray(numberArray))
}
fun minSumArray(number: IntArray): Double{
    return number.sum().toDouble() / number.size
}