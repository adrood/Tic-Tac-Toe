fun main() {
//    val num_cups = 5
//    val weekend = true
    val num_cups = readLine()!!.toInt()
    val isWeekend = readLine()!!.toBoolean()
    println(num_cups in 10..20 && !isWeekend || num_cups in 15..25 && isWeekend)
}