//Arrays: Left Rotation

/*

A left rotation operation on an array shifts each of the array's elements 1 unit to the left.
For example, if 2 left rotations are performed on array [1,2,3,4,5], then the array would become [3,4,5,1,2].
Note that the lowest index item moves to the highest index in a rotation. This is called a circular array.

 Sample Input
 5 4
 1 2 3 4 5

 Sample Output
 5 1 2 3 4
 */

fun rotateLeft(array: Array<Int>, d: Int): Array<Int> {
    // Write your code here
    val arrayFirst: MutableList<Int> =  ArrayList()
    val arraySecond: MutableList<Int> =  ArrayList()
    val finalArray: MutableList<Int> = ArrayList()
    for(indexValue in array) {
        if(indexValue <= d) {
            arrayFirst.add(indexValue)
        } else {
            arraySecond.add(indexValue)
        }
    }
    println(arraySecond)
    println(arrayFirst)

    finalArray.addAll(arraySecond)
    finalArray.addAll(arrayFirst)
    return  finalArray.toTypedArray();
}


fun main(args: Array<String>) {
    val firstMultipleInput = readLine()!!.trimEnd().split(" ")

    val n = firstMultipleInput[0].toInt()
    val d = firstMultipleInput[1].toInt()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = rotateLeft(a, d)

    println(result.joinToString(" "))
}

