import java.time.LocalDate

fun main(){
    val data = LocalDate.now()
    print("yearOfBirth : ")
    val yearOfBirth = readln().toIntOrNull()?:0
    val currentYear = data.year
    val result = currentYear - yearOfBirth
    println("Age = $result")

}