package lesson_2

fun main(){
    print("heightlnCm : ")
    val heightln = readln().toDoubleOrNull()?:0.0
    val result = heightln / 100.0
    println("Height = $result m")


}