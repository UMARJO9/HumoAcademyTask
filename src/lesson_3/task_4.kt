package lesson_3

fun main(){
    print("Раками рузи хафта :")
    val numberOfWeek = readln().toIntOrNull()?:0
    when(numberOfWeek){
        1->println("Душанбе")
        2->println("Сешанбе")
        3->println("Чоршанбе")
        4->println("Паншанбе")
        5->println("Чумъа")
        6->println("Шанбе")
        7->println("Якшанбе")
        else -> println("Раками Нодуруст")
    }
}