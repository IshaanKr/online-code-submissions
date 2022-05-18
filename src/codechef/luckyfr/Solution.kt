package codechef.luckyfr

import java.util.Scanner

//leetcode.containerWithMostWater.Driver Code
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val loop = scanner.nextInt()
    repeat(loop){
        println(resultOfOneInput(scanner.nextInt()))
    }
}

//Main Logic
fun resultOfOneInput(i1: Int): Int {
    return i1.toString().count { it == '4' }
}