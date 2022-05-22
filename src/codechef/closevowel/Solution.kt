package codechef.closevowel

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val loop = scanner.nextInt()
    repeat(loop) {
        val w = scanner.nextInt()
        println(solve(scanner.next()!!))

    }
}

fun solve(next: String): Int {
    val count = next.count {
        it == 'c' || it == 'g' || it == 'l' || it == 'r'
    }
    if (count == 0) return 1
    return twoKiPowerModulo(count)
}

fun twoKiPowerModulo(power: Int): Int {
    var ans = 1

    val quesModulo = 1000000007

    repeat(power) {
        ans = ans shl 1
        ans %= quesModulo
    }
    return ans
}


fun List<Int>.maxOf(selector: (Int) -> Unit){

}
