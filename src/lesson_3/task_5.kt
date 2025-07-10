package lesson_3

fun main() {
    val sadonokho = listOf("a", "e", "i", "o", "u")
    print("Харф : ")
    val chars = readln().lowercase()
    val result: Unit = when (chars) {
        in sadonokho -> println("Ин харф садонок хаст")
        else -> println("Ин харф садонок нест")
    }
}