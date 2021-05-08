fun main() {
    val input = readLine()!!
    val last = input.substring(input.length - 1)
    val first = input.substring(0, 1)
    val middle = input.substring(1, input.length - 1)
    val output = last + middle + first
    println(output)
}