package codechef.subscribe

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val loop = scanner.nextInt()
    repeat(loop){
        println(resultOfOneInput(scanner.nextInt()))
    }
}

fun resultOfTwoInput(i1: Int, i2: Int): String {
    return "Hello World"
}

fun resultOfOneInput(i1: Int): String {
    return if(i1>30) return "yes" else "no"
}