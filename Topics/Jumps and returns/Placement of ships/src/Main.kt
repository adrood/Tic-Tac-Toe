fun main() {
    val rows = mutableListOf(1, 2, 3, 4, 5)
    val cols = mutableListOf(1, 2, 3, 4, 5)
    repeat(3) {
        val (x, y) = readLine()!!.split(" ")
        rows.remove(x.toInt())
        cols.remove(y.toInt())
    }
    println(rows.joinToString(" "))
    println(cols.joinToString(" "))
}
