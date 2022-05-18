package codechef.blitz3_2

import java.util.Scanner

//leetcode.containerWithMostWater.Driver Code
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val loop = scanner.nextInt()
    repeat(loop) {
        println(resultOfThreeInput(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()))
    }
}

//Main Logic
fun resultOfThreeInput(i1: Int, i2: Int, i3: Int): Int {
    val total = 2 * (180 + i1)
    return total - i2 - i3
}