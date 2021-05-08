fun main() {
    val lastChar = readLine()!!.first()
    var loopChar = 'a'
    while (true) {
        print(loopChar++)
        if (loopChar == lastChar) {
            return
        }
    }
}