fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toIntArray()
    // Do not touch lines above
    // Write only exchange actions here.
    val tmp = numbers.get(0)
    val lastIndex = numbers.size - 1
    numbers.set(0, numbers.get(lastIndex))
    numbers.set(lastIndex, tmp)
    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}