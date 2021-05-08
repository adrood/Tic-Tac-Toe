fun main() {
    val ar = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    val rotation = readLine()!!.toInt()

    // Allocate the output array (rotated version of input array)
    val rar = IntArray(ar.size)

    // Fill it up
    for (index in ar.indices) {
        rar[(index + rotation) % ar.size] = ar[index]
    }

    // Print it
    println(rar.joinToString(" "))
}

// Sulution by Pavel Mineev:
import java.util.*

fun main2() = Array(readLine()!!.toInt()) { readLine()!!.toInt() }.toList().let {
    Collections.rotate(it, readLine()!!.toInt())
    print(it.joinToString(" "))
}