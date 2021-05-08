fun main() {
    val anN = readLine()!!.toInt()
    var highest = 0
    var beforeHighest = 0
    repeat(anN) {
        val number = readLine()!!.toInt()
        if (number > highest) {
            highest = number
        } else if (number > beforeHighest) {
            beforeHighest = number
        }
    }
    if (anN == 1) {
        println(highest)
    } else {
        println(highest * beforeHighest)
    }
}