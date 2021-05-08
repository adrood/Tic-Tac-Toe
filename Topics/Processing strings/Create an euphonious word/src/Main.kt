fun main() {
    val word = readLine()!!
    val result = reqNum(word)
    println(result)
}

// Return the number of characters required to create a euphonious word
fun reqNum(word: String): Int {
    val parts = word.split("b", "c", "d", "f", "g",
        "h", "j", "k", "l", "m",
        "n", "p", "q", "r", "s",
        "t", "v", "w", "x", "z",
    )
    var result = 0
    for (part in parts) {
        result += (part.length - 1) / 2
    }
    val parts2 = word.split("a", "e", "i", "o", "u", "y"
    )
    for (part2 in parts2) {
        result += (part2.length - 1) / 2
    }

    return result
}
