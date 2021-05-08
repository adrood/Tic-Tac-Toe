// write your function here

fun main() {    
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    fun sum(a: Int, b: Int, c: Int) = a + b + c

    println(sum(a, b, c))

}