package codechef.fctrl2

import java.math.BigInteger
import java.util.*

//leetcode.containerWithMostWater.Driver Code
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val loop = scanner.nextInt()
    repeat(loop) {
        println(resultOfOneInput(scanner.nextInt()))
    }
}

//Main Logic
fun resultOfOneInput(i1: Int): String {
    var result = BigInteger.ONE
    for (it in 1..i1) {
        result = result.multiply(BigInteger(it.toString()))
    }
    return result.toString()
}
