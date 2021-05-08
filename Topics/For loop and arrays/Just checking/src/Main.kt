fun main() {
    val ar = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    if (ar.contains(a) && ar.contains(b)) {
        println("YES")
    } else println("NO")
}