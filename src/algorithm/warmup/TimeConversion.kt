package algorithm.warmup

import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*

/*
 * Complete the timeConversion function below.
 */
fun timeConversion(s: String): String {
    /*
     * Write your code here.
     */
    val amOrPm = s.substring(8,10)
    val time = s.substring(0,8)
    when {
        amOrPm == "AM" -> {
            if(time.startsWith("12")){
                return time.replaceFirst("12","00", false)
            }
            return time
        }
        time.startsWith("12") -> {
            return time
        }
        else -> {
            return (time.substring(0,2).toInt() + 12).toString().plus(time.substring(2,8))
        }
    }

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}