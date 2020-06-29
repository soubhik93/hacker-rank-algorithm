package algorithm.warmup

import java.util.*

// Complete the staircase function below.
fun staircase(n: Int): Unit {
   /* for (i in 1..n){
        for (j in 1..i){
            print("#")
        }
        println()
    }*/

    for (i in n downTo 1){
        for (j in 1..i-1){
            print(" ")
        }
        for(k in 1..n-i+1){
            print("#")
        }
        println()
    }

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    staircase(n)
}
