package algorithm.hard

import java.util.*
import kotlin.collections.ArrayList


// Complete the maximumSum function below.
/*fun maximumSum(a: Array<Long>, m: Long): Long {
    *//*val len = a.size
    var maxModulo = 0L
    for (i in 0 until len) {
        for (j in i..len) {
            val modulo = a.toList().subList(i, j).sum().rem(m)
            if (modulo > maxModulo) {
                maxModulo = modulo
            }
            if (maxModulo == m - 1) return maxModulo
        }
    }
    return maxModulo*//*

    val len = a.size
    var maxModulo = 0L

    for (i in 1..len){
        val modulo = a.toList().windowed(i, partialWindows = true) {it.sum().rem(m)}.max()
        if (modulo == m - 1) return modulo
        if (modulo!! > maxModulo) {
            maxModulo = modulo
        }
    }
    return maxModulo
}*/


fun maximumSum(a: Array<Long>, m: Long): Long {
    val sums = buildSums(a, m)
    var result = sums.max() ?: 0
    val sortedSums: NavigableSet<Long> = TreeSet()
    for (sum in sums) {
        val higher = sortedSums.higher(sum)
        if (higher != null) {
            result = Math.max(result, addMod(sum, -higher, m))
        }
        sortedSums.add(sum)
    }
    return result
}

fun buildSums(a: Array<Long>, m: Long): ArrayList<Long> {
    var sums = arrayListOf<Long>()
    var sum: Long = 0
    for (i in sums.indices) {
        sum = addMod(sum, a[i], m)
        sums[i] = sum
    }
    return sums
}

fun addMod(x: Long, y: Long, modulus: Long): Long {
    return ((x + y) % modulus + modulus) % modulus
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val nm = scan.nextLine().split(" ")

        val n = nm[0].trim().toInt()

        val m = nm[1].trim().toLong()

        val a = scan.nextLine().split(" ").map { it.trim().toLong() }.toTypedArray()

        val result = maximumSum(a, m)

        println(result)
    }
}
