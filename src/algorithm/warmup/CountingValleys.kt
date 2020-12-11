package algorithm.warmup

/*
 * Complete the 'countingValleys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */

fun countingValleys(steps: Int, path: String): Int {
    // Write your code here
    var upAndDown = 0;
    var valleys = 0;
    path.toCharArray().forEach {
        if (it == 'U') {
            upAndDown += 1
            if (upAndDown == 0) {
                valleys += 1
            }
        } else if (it == 'D'){
            upAndDown -= 1
        }
    }
    return valleys

}

fun main(args: Array<String>) {
    val steps = readLine()!!.trim().toInt()

    val path = readLine()!!

    val result = countingValleys(steps, path)

    println(result)
}
