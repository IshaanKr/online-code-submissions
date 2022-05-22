package codechef.mxmodsum

import java.util.Scanner
import kotlin.math.max

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val loop = scanner.nextInt()
    repeat(loop) {
        val noOfInput = scanner.nextInt()
        val modulus = scanner.nextInt()

        val inputArray = mutableListOf<Int>()
        repeat(noOfInput) {
            inputArray.add(scanner.nextInt())
        }

        println(solve(inputArray, modulus))

    }
}

fun solve(inputArray: List<Int>, modulus: Int): Int {
    var ans = 0
    val maxInput = inputArray.maxOf { it }

    val secondMaxInput = inputArray.maxOf {
        if (it == maxInput) return@maxOf 0
        it
    }

    return max(compute(maxInput, maxInput, modulus), compute(maxInput, secondMaxInput, modulus))
}

fun compute(m1: Int, m2: Int, mod: Int): Int {
    return m1 + m2 + max(Math.floorMod(m1 - m2, mod), Math.floorMod(m2-m1,mod))
}

fun List<Int>.maxOf(selector: (Int) -> Int): Int {
    val iterator = iterator()
    if (!iterator.hasNext()) throw NoSuchElementException()
    var maxValue = selector(iterator.next())
    while (iterator.hasNext()) {
        val v = selector(iterator.next())
        if (maxValue < v) {
            maxValue = v
        }
    }
    return maxValue
}
