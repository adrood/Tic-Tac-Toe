fun main() {
    val str = readLine()!!
    val index = readLine()!!.toInt()
    val the_char = str[index - 1]
    println("Symbol # $index of the string \"$str\" is '$the_char'")
}