package lesson_4

fun main(){
    val numberArray = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    var sum = 0
    for (i in numberArray) sum += i
    println(sum)
}