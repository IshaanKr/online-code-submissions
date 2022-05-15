package codechef.f1rule

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val loop = scanner.nextInt()
    repeat(loop) {
        println(result(scanner.nextInt(), scanner.nextInt()))
    }
}

fun result(i1: Int, i2: Int): String {
    return if (1.07 * i1 >= i2) "yes" else "no"
}
