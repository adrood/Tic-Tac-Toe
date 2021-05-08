fun main() {
    val firstAnswer = readLine().toBoolean()
    val secondAnswer = readLine().toBoolean()
    val confession = readLine().toBoolean()
    val isNotTrusted = firstAnswer xor secondAnswer || confession
    println(!isNotTrusted)
}