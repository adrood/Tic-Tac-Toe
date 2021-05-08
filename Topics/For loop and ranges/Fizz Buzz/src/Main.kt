fun main() {
    val lb = readLine()!!.toInt()
    val ub = readLine()!!.toInt()
    for (i in lb..ub) {
        if (i % 15 == 0) {
            println("FizzBuzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else {
            println(i)
        }
    }
}