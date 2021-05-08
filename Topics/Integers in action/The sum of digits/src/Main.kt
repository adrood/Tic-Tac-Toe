fun main() {
    val digits = readLine()!!.toInt()
//    val digits: Int = 476
//    println("digits $digits")
    val hundreds = digits / 100
//    println("hundreds $hundreds")
    val rem1 = digits - hundreds * 100
//    println("rem1: $rem1")
    val tens = rem1 / 10
//    println("tens: $tens")
    val rem2 = rem1 - tens * 10
//    println("rem2 $rem2")
    val result = hundreds + tens + rem2
    println(result)
}