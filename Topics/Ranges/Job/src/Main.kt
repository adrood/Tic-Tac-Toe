fun main() {
    val age = readLine()!!.toInt()
    val is_able = age in 18..59
    println(is_able)
}