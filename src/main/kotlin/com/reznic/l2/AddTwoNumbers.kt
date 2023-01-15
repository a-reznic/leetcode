package com.reznic.l2

import java.math.BigInteger

/**
 * https://leetcode.com/problems/add-two-numbers/
 * 2. Add Two Numbers - Kotlin
 */
fun main() {
    val solution = Solution()
    val case0 = solution
        .addTwoNumbers(
            solution.createListNode(intArrayOf(5,6,4)),
            solution.createListNode(intArrayOf(1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1))
        )

    println(case0)

    val case2 = solution
        .addTwoNumbers(
            solution.createListNode(intArrayOf(2, 4, 9)),
            solution.createListNode(intArrayOf(5, 6, 4, 9))
        )
    //[7,0,4,0,1]
    println(case2)

    val case4 = solution
        .addTwoNumbers(
            solution.createListNode(intArrayOf(  9)),
            solution.createListNode(intArrayOf(1,9,9,9,9,9,9,9,9,9))
        )
     println(case4)

    val case3 = solution
        .addTwoNumbers(
            solution.createListNode(intArrayOf(9, 9, 9, 9, 9, 9, 9)),
            solution.createListNode(intArrayOf(9, 9, 9, 9))
        )

    println(case3)
}


class Solution {

    fun createListNode(values: IntArray): ListNode {
        val root = ListNode(values.first())
        var next: ListNode = root

        for (i in 1..values.lastIndex) {
            val x = ListNode(values[i])
            next.next = x
            next = x
        }

        return root
    }

    fun addTwoNumbers(l1: ListNode, l2: ListNode): ListNode {
        var next: ListNode? = l1
        var next2: ListNode? = l2
        val l1A = ArrayDeque<Int>()
        val l2A = ArrayDeque<Int>()

        while (next != null || next2 != null) {
            next?.let { l1A.add(it.`val`) }
            next2?.let { l2A.add(it.`val`) }

            next = next?.next
            next2 = next2?.next
        }
        val firstNumber = BigInteger(l1A.reversed().joinToString(separator = "") { it.toString(10) },10)
        val secondNumber = BigInteger(l2A.reversed().joinToString(separator = "") { it.toString(10) },10)
        val sumString = (secondNumber + firstNumber).toString()
        val resultList  = sumString.map {
            it.toString().toInt(10)
        }.reversed()

        return createListNode(resultList.toIntArray())
    }
}

data class ListNode(var `val`: Int) {
    var next: ListNode? = null
}