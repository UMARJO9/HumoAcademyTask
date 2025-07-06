fun main(){
    print("width : ")
    val width = readln().toDoubleOrNull()?:0.0
    print("height : ")
    val height = readln().toDoubleOrNull()?:0.0
    val result = width * height
    println("Area of a rectangle $result")
}