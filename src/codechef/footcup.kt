package codechef

import java.util.Scanner

//Driver Code
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val loop = scanner.nextInt()
    repeat(loop) {
        println(resultOfTwoInput(scanner.nextInt(), scanner.nextInt()))
    }
}

//Main Logic
fun resultOfTwoInput(i1: Int, i2: Int): String {
    return if (i1 == i2 && i1 != 0) return "yes" else "no"
}