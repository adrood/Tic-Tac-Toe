fun main() {
    val (a, b, c) = Array(3) { readLine()!!.toInt() }
    print(a >= b && a <= c || a <= b && a >= c)
}
