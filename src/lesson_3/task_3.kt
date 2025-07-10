package lesson_3

fun main() {
    print("Раками 1 : ")
    val number1 = readln().toIntOrNull() ?: 0
    print("Раками 2 : ")
    val number2 = readln().toIntOrNull() ?: 0
    val result: Unit = when {
        (number1 > number2) -> println("Раками 1 : $number1")
        else -> println("Раками 2 : $number2")
    }
}