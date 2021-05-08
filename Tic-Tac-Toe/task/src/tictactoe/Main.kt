package tictactoe

import java.lang.NumberFormatException

fun main() {
    var symbolString = "         "
    printState(symbolString)
//    print("Enter the coordinates: ")
    var input = ""
    var index = 0
    var symbol = "O"
    while (!(isXWin(symbolString) || isOWin(symbolString) || isDraw(symbolString))) {
        if (symbol == "X") {
            symbol = "O"
        } else {
            symbol = "X"
        }
        input = receiveInput()
        index = getIndex(input)
        while (symbolString[index] == 'X' || symbolString[index] == 'O') {
            println("\nThis cell is occupied! Choose another one!")
            input = receiveInput()
            index = getIndex(input)
        }
        symbolString = symbolString.substring(0, index) + symbol + symbolString.substring(index + 1)
//        println()
        printState(symbolString)
    }
    printResult(symbolString)
}

fun checkBounds(x: Int, y: Int): Boolean {
    return !(x in 1..3 && y in 1..3)
}

fun getIndex(input: String): Int {
    if (!input.contains(' ')) {
        println("\nYou should enter numbers!")
        print("enter the coordinates")
        return getIndex(receiveInput())
    }
    val (x, y) = input.split(" ")
    var iX = 0
    var iY = 0
    try {
        iX = x.toInt()
        iY = y.toInt()
    } catch (e: NumberFormatException) {
        println("You should enter numbers!")
        print("Enter the coordinates: ")
        return getIndex(receiveInput())
    }
    if (!checkBounds(iX, iY)) {
        return (iX - 1) * 3 + iY - 1
    } else {
        println("Coordinates should be from 1 to 3!")
        print("Enter the coordinates: ")
        return getIndex(receiveInput())
    }
}

fun receiveInput(): String {
    print("Enter the coordinates: ")
    return readLine()!!
}

fun printState(symbolString: String?) {
    println("---------")
    val line1 = symbolString?.substring(0, 3)
    val line2 = symbolString?.substring(3, 6)
    val line3 = symbolString?.substring(6, 9)
    println(formatLine(line1))
    println(formatLine(line2))
    println(formatLine(line3))
    println("---------")
}

fun formatLine(line1: String?): String? {
    return ("| "
            + line1?.get(0)
            + " "
            + line1?.get(1)
            + " "
            + line1?.get(2)
            + " |"

            )
}

fun printResult(symbolString: String?) {
    if (isXWin(symbolString) && isOWin(symbolString)) {
        println("Impossible")
    } else if (isImpossible(symbolString)) {
        println("Impossible")
    } else if (isXWin(symbolString)) {
        println("X wins")
    } else if (isOWin(symbolString)) {
        println("O wins")
    } else if (isDraw(symbolString)) {
        println("Draw")
    } else {
        println("Game not finished")
    }

}

fun isXWin(symbolString: String?): Boolean =
    symbolString!![0] == 'X' &&
            symbolString!![1] == 'X' &&
            symbolString!![2] == 'X' ||

            symbolString!![3] == 'X' &&
            symbolString!![4] == 'X' &&
            symbolString!![5] == 'X' ||

            symbolString!![6] == 'X' &&
            symbolString!![7] == 'X' &&
            symbolString!![8] == 'X' ||

            symbolString!![0] == 'X' &&
            symbolString!![3] == 'X' &&
            symbolString!![6] == 'X' ||

            symbolString!![1] == 'X' &&
            symbolString!![4] == 'X' &&
            symbolString!![7] == 'X' ||

            symbolString!![2] == 'X' &&
            symbolString!![5] == 'X' &&
            symbolString!![8] == 'X' ||

            symbolString!![0] == 'X' &&
            symbolString!![4] == 'X' &&
            symbolString!![8] == 'X' ||

            symbolString!![2] == 'X' &&
            symbolString!![4] == 'X' &&
            symbolString!![6] == 'X'

fun isOWin(symbolString: String?): Boolean =
    symbolString!![0] == 'O' &&
            symbolString!![1] == 'O' &&
            symbolString!![2] == 'O' ||

            symbolString!![3] == 'O' &&
            symbolString!![4] == 'O' &&
            symbolString!![5] == 'O' ||

            symbolString!![6] == 'O' &&
            symbolString!![7] == 'O' &&
            symbolString!![8] == 'O' ||

            symbolString!![0] == 'O' &&
            symbolString!![3] == 'O' &&
            symbolString!![6] == 'O' ||

            symbolString!![1] == 'O' &&
            symbolString!![4] == 'O' &&
            symbolString!![7] == 'O' ||

            symbolString!![2] == 'O' &&
            symbolString!![5] == 'O' &&
            symbolString!![8] == 'O' ||

            symbolString!![0] == 'O' &&
            symbolString!![4] == 'O' &&
            symbolString!![8] == 'O' ||

            symbolString!![2] == 'O' &&
            symbolString!![4] == 'O' &&
            symbolString!![6] == 'O'

fun isDraw(symbolString: String?): Boolean =
    !symbolString!!.contains(' ')

fun isImpossible(symbolString: String?): Boolean {
    var numX = 0
    var numY = 0
    for (symbol in symbolString!!) {
        if (symbol == 'X') {
            numX++
        } else if (symbol == 'O') {
            numY++
        }
    }
    return Math.abs(numX - numY) > 1
}

val array0 = arrayListOf<String>(
    "XXXOO__O_", // Example 1, X wins
    "XOXOXOXXO", // Example 2, X wins
    "XOOOXOXXO", // Example 3, O wins
    "XOXOOXXXO", // Example 4, Draw
    "XO_OOX_X_", // Example 5, Game not finished
    "XO_XO_XOX", // Example 6, Impossible
    "_O_X__X_X", // Example 7, _Impossible
    "_OOOO_X_X", // Example 8, Impossible
)

val array = arrayListOf<String>(
    "X_X_O____", // Example 1, X wins
    "_XXOO_OX_", // Example 2, X wins
    "_XXOO_OX_", // Example 3, O wins
    "_XXOO_OX_", // Example 4, Draw
    "_XXOO_OX_", // Example 5, Game not finished
    "_XXOO_OX_", // Example 6, Impossible
    "_XXOO_OX_", // Example 7, _Impossible
)
