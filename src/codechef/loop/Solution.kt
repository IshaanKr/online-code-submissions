package codechef.loop

import java.util.Scanner
import kotlin.math.*

//leetcode.containerWithMostWater.Driver Code
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val loop = scanner.nextInt()
    repeat(loop) {
        println(resultOfThreeInput(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()))
    }
}

//Main Logic
fun resultOfThreeInput(i1: Int, i2: Int, i3: Int): String {
    val diff1 = abs(i1 - i2)
    val diff2 = abs(max(i1, i2) - i3) + min(i1, i2)
    return min(diff1, diff2).toString()
}