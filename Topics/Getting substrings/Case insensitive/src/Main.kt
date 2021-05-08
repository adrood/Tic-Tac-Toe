fun main() {
    val str1 = readLine()
    val str2 = readLine()
    if (str1.equals(str2, ignoreCase = true)) {
        print(true)
    } else {
        print(false)
    }
}