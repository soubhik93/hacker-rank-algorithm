package algorithm.hard

import java.math.BigInteger
import java.util.*

// Complete the bigSorting function below.
fun bigSorting(unsorted: Array<String>): Array<String> {
    if (unsorted.size > 1) {
        val mid = unsorted.size / 2
        val lefArr = unsorted.sliceArray(0 until mid)
        val rigArr = unsorted.sliceArray(mid until unsorted.size)

        bigSorting(lefArr);
        bigSorting(rigArr);


        merging(lefArr, rigArr, unsorted)
    }
    return unsorted
}

fun merging(leftArray: Array<String>, rightArray: Array<String>, result: Array<String>) {

    var i = 0;
    var j = 0;
    var k = 0;

    while (i < leftArray.size && j < rightArray.size) {
        if (BigInteger(leftArray[i]) < BigInteger(rightArray[j])) {
            result[k] = leftArray[i]
            i++
        } else {
            result[k] = rightArray[j]
            j++
        }
        k++
    }

    while (i < leftArray.size) {
        result[k] = leftArray[i]
        i++
        k++
    }

    while (j < rightArray.size) {
        result[k] = rightArray[j]
        j++
        k++
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val unsorted = Array<String>(n, { "" })
    for (i in 0 until n) {
        val unsortedItem = scan.nextLine()
        unsorted[i] = unsortedItem
    }

    val result = bigSorting(unsorted)

    println(result.joinToString("\n"))
}
