package algorithm.warmup

import java.util.*

// Complete the birthdayCakeCandles function below.
fun birthdayCakeCandles(ar: Array<Int>): Int {
    val maxHeight = ar.toList().max()
    return ar.toList().filter { it == maxHeight }.count()

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = birthdayCakeCandles(ar)

    println(result)
}
