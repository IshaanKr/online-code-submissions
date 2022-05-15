package codechef.base

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val loop = scanner.nextInt()
    repeat(loop){
        println(resultOfOneInput(scanner.nextInt()))
        println(resultOfTwoInput(scanner.nextInt(), scanner.nextInt()))
    }
}

fun resultOfTwoInput(i1: Int, i2: Int): String {
    return "Hello World"
}

fun resultOfOneInput(i1: Int): String {
    return "Hello World"
}