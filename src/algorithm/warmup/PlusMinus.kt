package algorithm.warmup

import java.util.*

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>): Unit {
    val length = arr.size
    val positiveCounts = arr.toList().filter { it > 0 }.size
    val negativeCounts = arr.toList().filter { it < 0 }.size
    val zeroCounts = length - (positiveCounts + negativeCounts)
    println("%.6f".format(positiveCounts.toDouble() / length))
    println("%.6f".format(negativeCounts.toDouble() / length))
    println("%.6f".format(zeroCounts.toDouble() / length))


}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}