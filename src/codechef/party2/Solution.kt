package codechef.party2

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
fun resultOfThreeInput(i1: Int, i2: Int, i3: Int): String {
    return if (i1 * i2 <= i3) return "yes" else "no"
}