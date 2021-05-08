fun main() {
    val str1 = readLine()!!
    val oper = readLine()!!
    val str2 = readLine()!!
    when (oper) {
        "equals" -> println(str1 == str2)
        "plus" -> println(str1 + str2)
        "endsWith" -> println(str1.endsWith(str2))
        else -> println("Unknown operation")
    }
}