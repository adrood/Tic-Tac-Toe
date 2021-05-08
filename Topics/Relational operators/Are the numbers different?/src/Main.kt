fun main() {
//    val i = 1
//    val j = 2
//    val k = 3
    val (i, j, k) = Array(3) { readLine()!!.toInt() }
    val result = i != j && i != k && j != k
    println(result)
}