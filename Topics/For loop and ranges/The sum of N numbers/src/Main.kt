fun main() {
    val nLines = readLine()!!.toInt()
    var sum = 0
    repeat(nLines) {
        sum += readLine()!!.toInt()
    }
    println(sum)
}