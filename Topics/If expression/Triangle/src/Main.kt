fun main() {
    val (a, b, c) = Array(3) { readLine()!!.toInt() }
    print(if (a + b > c && a + c > b && b + c > a) "YES" else "NO")
}