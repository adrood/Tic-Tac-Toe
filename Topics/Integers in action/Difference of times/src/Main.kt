fun main() {
    val hours1 = readLine()!!.toInt()
    val minutes1 = readLine()!!.toInt()
    val seconds1 = readLine()!!.toInt()

    val hours2 = readLine()!!.toInt()
    val minutes2 = readLine()!!.toInt()
    val seconds2 = readLine()!!.toInt()

    val result = (hours2 - hours1) * 3600 + (minutes2 - minutes1) * 60 + (seconds2 - seconds1)

    println(result)
}