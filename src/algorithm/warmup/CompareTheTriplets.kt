package algorithm.warmup

// Complete the compareTriplets function below.
fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var resultA = 0
    var resultB = 0
    listOf(0,1,2).forEach { if(a[it] > b[it])  resultA++ else if(b[it] > a[it]) resultB++ }
    return arrayOf(resultA, resultB)

}

fun main(args: Array<String>) {
    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
