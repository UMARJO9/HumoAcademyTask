package lesson_3

fun main(){
    print("Адад :")
    val number = readln().toIntOrNull()?:0
    when{
        (number > 0) -> println("Адад мусбат аст")
        (number < 0) -> println("Адад манфи аст")
        else -> println("Адад ба 0 баробар аст")
    }
}