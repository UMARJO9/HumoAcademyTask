package lesson_6

fun main(){
    val student = Student("Umar",18,5.44)
    student.printInfo()
}

class Student(
    name: String? = null,
    age: Int? = null,
    grade: Double? = null
){
    private val name = name?:"Ном нест"
    private val age = age?:"Сол нест"
    private val grade = grade?:"Бахо нест"

    fun printInfo(){
        println("Ном: $name\nСину сол: $age\nХол: $grade")
    }
}
