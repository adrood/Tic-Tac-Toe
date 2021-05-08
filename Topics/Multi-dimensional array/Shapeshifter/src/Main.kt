fun main() {
    // Do not touch code below
    var inputArray: Array<Array<String>> = arrayOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toTypedArray()
        inputArray += strings
    }
    // write your code here
    val newArray = arrayOf(inputArray[inputArray.lastIndex], inputArray[0])
    println(newArray.contentDeepToString())
}

// Sample input:
// 3
// 1 0 1
// 0 0 0
// 1 0 1
// Output:
// [[1, 0, 1], [0, 0, 0], [1, 0, 1]]