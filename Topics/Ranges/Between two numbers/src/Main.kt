fun main() {
    val n1 = readLine()!!.toInt()
    val n2 = readLine()!!.toInt()
    val n3 = readLine()!!.toInt()

    val range1 = n2..n3

    val result = n1 in range1
    println(result)
}