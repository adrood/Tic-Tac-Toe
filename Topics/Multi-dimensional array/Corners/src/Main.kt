fun main() {
    // Do not touch code below
    var inputArray: Array<Array<String>> = arrayOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toTypedArray()
        inputArray += strings
    }
    println(inputArray[0].first() + " " + inputArray[0].last())
    println(inputArray[inputArray.lastIndex].first() + " " + inputArray[inputArray.lastIndex].last())
}

// Sample input:
// 3
// 1 0 1
// 0 0 0
// 1 0 1
// Output:
// [[1, 0, 1], [0, 0, 0], [1, 0, 1]]