fun main() {
    val count = readLine()!!.toInt()
    var nLarger = 0
    var nSmaller = 0
    var nPerfect = 0
    repeat(count) {
        val size = readLine()!!.toInt()
        if (size > 0) {
            nLarger++
        } else if (size < 0) {
            nSmaller++
        } else {
            nPerfect++
        }
    }
    println("$nPerfect $nLarger $nSmaller")
}