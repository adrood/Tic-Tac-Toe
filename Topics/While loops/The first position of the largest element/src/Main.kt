import java.util.*

fun main() {
    val ints = arrayListOf<Int>()
    val scanner = Scanner(System.`in`)
    while (scanner.hasNextInt()) {
        ints.add(scanner.nextInt())
    }
//    println(ints.joinToString(" "))
    val maxInt = ints.maxOf { it }
    print("$maxInt ${ints.indexOf(maxInt) + 1}")
}