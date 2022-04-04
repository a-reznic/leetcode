package net.reznic.leetcode

fun main() {
    val addTwoNumbers = Solution().addTwoNumbers(node(2, 4, 3), node(5, 6, 4))

}

fun node(vararg values: Int): ListNode {
    val root = ListNode(values.first())
    var next: ListNode = root

    for (i in 1 until values.size) {
        val x = ListNode(values[i])
        next.next = x
        next = x
    }

    return root
}

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var next: ListNode? = l1
        var next2: ListNode? = l2
        var result: ListNode? = null
        var decimal = 0

        while (next != null && next2 != null && decimal != 1) {
            val value = next.`val` + next2.`val` + decimal
            decimal = value / 10

            val x = ListNode(value % 10)

            next = next.next
            next2 = next2.next
        }
        return result
    }
}

data class ListNode(var `val`: Int) {
    var next: ListNode? = null
}