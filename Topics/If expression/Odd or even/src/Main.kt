fun main() {
    val n = readLine()!!.toInt()
    val output = if (n % 2 == 0) "EVEN" else "ODD"
    println(output)
}