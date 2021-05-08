fun main() {
    val anInt = readLine()!!.toInt()
    if (anInt < 0) {
        println("negative")
    } else if (anInt > 0) {
        println("positive")
    } else {
        println("zero")
    }
}