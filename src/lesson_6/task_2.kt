package lesson_6


fun main() {
    val car = Car("BMW",)
    println(car.isOldCar())
}

class Car(
    brand: String? = null,
    year: Int? = null
){
    private val brand = brand?:"Бренди Мошин нест"
    private val year = year?:0

    fun isOldCar(): Boolean{return year < 2010}
}