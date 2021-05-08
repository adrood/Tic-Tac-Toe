import java.util.*

fun main() {
    var amount = readLine()!!.toInt()
    val scanner = Scanner(System.`in`)
    while (amount >= 0 && scanner.hasNextInt()) {
        val transaction = scanner.nextInt()
        if (amount < transaction) {
            println("Error, insufficient funds for the purchase. You have $amount, but you need $transaction.")
        }
        amount -= transaction
    }
    if (amount >= 0) {
        println("Thank you for choosing us to manage your account! You have $amount money.")
    }
}