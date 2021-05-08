fun main() {
    val numberOfElts = readLine()!!.toInt()
    var max = 0
    var curr = 0
    repeat(numberOfElts) {
        curr = readLine()!!.toInt()
        if (curr % 4 == 0 && curr > max) {
            max = curr
        }
    }
    println(max)
}