package lesson_2

fun main(){
    print("a : ")
    val a = readln().toIntOrNull()?: 0
    print("b : ")
    val b = readln().toIntOrNull()?: 0
    val result = a + b
    println("Sum = $result")
}