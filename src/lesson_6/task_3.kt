package lesson_6


fun main() {
    val myAccountBank = BankAccount("Umar", 500.0)
    myAccountBank.deposit(0.0)
    myAccountBank.withdraw(1.0)
    myAccountBank.printBalance()
}

class BankAccount(
    private val owner: String? = "",
    private var balance: Double = 0.0
) {
    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Ба хисоби шумо $amount пул дароварда шуд")
        } else {
            println("Пули шумо бояд аз  0 калон бошад")
        }
    }

    fun withdraw(amount: Double) {
        if (amount <= balance && amount > 0) {
            balance -= amount
            println("Аз хисоби шумо $amount пул гирифта шуд")
        } else {
             println(if (amount <= 0) "Шумо наметавонед 0 бароред" else "Маблаг кофи нест")
        }
    }

    fun printBalance() {
        println("Бакияи Хисоби шумо : $balance")
    }
}