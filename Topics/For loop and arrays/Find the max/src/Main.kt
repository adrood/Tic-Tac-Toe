fun main() {
    val ar = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    val max = ar.maxOrNull()
    val result = ar.indexOfFirst { it == max }
    println(result)

}