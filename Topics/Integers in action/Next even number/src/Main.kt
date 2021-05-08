fun main() {
    val number = readLine()!!.toInt()
//    val number = 7
    val nextEven = number + 2 - number.rem(2)
    println(nextEven)
}