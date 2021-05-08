fun main() {
    val a_char = readLine()!!.first()
    println(a_char.isUpperCase() || a_char in '1'..'9')
}