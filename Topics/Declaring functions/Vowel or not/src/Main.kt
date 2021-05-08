// write your function here

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}

// Solution by Angelina Yudina
fun isVowel(letter: Char): Boolean {
    return letter.toLowerCase() in listOf<Char>('a', 'e', 'i', 'o', 'u')
}
