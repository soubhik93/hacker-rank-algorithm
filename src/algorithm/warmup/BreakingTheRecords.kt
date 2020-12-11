package algorithm.warmup

import java.util.*

// Complete the breakingRecords function below.
fun breakingRecords(scores: Array<Int>): Array<Int> {
    var min = 0
    var max = 0
    var minimumScore = -1
    var maximumScore = -1

    for (score in scores) {
        if (minimumScore == -1 && maximumScore == -1) {
            minimumScore = score
            maximumScore = score
        } else if (score < minimumScore) {
            min++
            minimumScore = score
        } else if (score > maximumScore) {
            max++
            maximumScore = score
        } else continue

    }

    return arrayOf(max, min);

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}


