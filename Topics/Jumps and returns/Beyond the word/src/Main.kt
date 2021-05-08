fun main() {
    val word = readLine()!!
    for (i in 'a'..'z')
        if (word.contains(i)) {
            continue
        } else {
            print(i)
        }
}