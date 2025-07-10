package lesson_3

fun main(){
    print("Сол :")
    val age = readln().toIntOrNull()?:0
    val result: Unit = when(age){
        in 7..17->println("Шумо хонанда хастед")
        in 0..6->println("Шумо кудак хастед")
        in 18..100->println("Шумо калонсол хастед")
        else -> println("Чунин сол нестед")
    }
}