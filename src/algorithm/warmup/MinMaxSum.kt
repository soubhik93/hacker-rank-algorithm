package algorithm.warmup

import java.util.*

// Complete the miniMaxSum function below.
fun miniMaxSum(arr: Array<Int>): Unit {
    val arrList = arr.toList().sorted()
    val minSum = arrList.slice(0..3).map { it.toLong() }.sum()
    val maxSum = arrList.slice(1..4).map { it.toLong() }.sum()

    print("$minSum $maxSum")

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    miniMaxSum(arr)
}