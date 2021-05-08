fun main() {
    val str = readLine()!!
    var prev = str[0]
    var valid = true
    for (letter in str.substring(1)) {
        if (letter - 1 != prev) {
            valid = false
            break
        } else {
            prev = letter
        }
    }
    println(valid)
}