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
    var listFirst: MutableList<Int> =  ArrayList()
    var listSecond: MutableList<Int> =  ArrayList()
    val finalList: MutableList<Int> = ArrayList()
    val givenList: MutableList<Int> = array.toMutableList()
    // break list into two partitions
    if(d <= givenList.size) {
        listFirst.addAll(givenList.subList(d, givenList.size))
        listSecond.addAll(givenList.subList(0, d))
    }
    finalList.addAll(listFirst)
    finalList.addAll(listSecond)
    return  finalList.toTypedArray();
}


fun main(args: Array<String>) {
    val firstMultipleInput = readLine()!!.trimEnd().split(" ")
    val n = firstMultipleInput[0].toInt()
    val d = firstMultipleInput[1].toInt()
    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val result = rotateLeft(a, d)
    println(result.joinToString(" "))
}

