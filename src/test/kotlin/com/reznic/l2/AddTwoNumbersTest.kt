package com.reznic.l2

import kotlin.test.Test

class AddTwoNumbersTest {
    private val addTwoNumbers = AddTwoNumbers()

    @Test
    fun case1() {
        val case0 = addTwoNumbers
            .addTwoNumbers(
                addTwoNumbers.createListNode(intArrayOf(5, 6, 4)),
                addTwoNumbers.createListNode(
                    intArrayOf(
                        1,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        1
                    )
                )
            )
    }

    @Test
    fun case2() {
        val node = addTwoNumbers.addTwoNumbers(
            addTwoNumbers.createListNode(intArrayOf(2, 4, 9)),
            addTwoNumbers.createListNode(intArrayOf(5, 6, 4, 9))
        )
        assert(node.`val` == 7)
        assert(node.next?.`val` == 0)
        assert(node.next?.next?.`val` == 4)
    }

    @Test
    fun case3() {
        val node = addTwoNumbers
            .addTwoNumbers(
                addTwoNumbers.createListNode(intArrayOf(9)),
                addTwoNumbers.createListNode(intArrayOf(1, 9, 9, 9, 9, 9, 9, 9, 9, 9))
            )
        assert(node.`val` == 0)
        assert(node.next?.`val` == 0)
    }

    @Test
    fun case4() {
        val node = addTwoNumbers.addTwoNumbers(
            addTwoNumbers.createListNode(intArrayOf(9, 9, 9, 9, 9, 9, 9)),
            addTwoNumbers.createListNode(intArrayOf(9, 9, 9, 9))
        )
        assert(node.`val` == 8)
        assert(node.next?.`val` == 9)
        assert(node.next?.next?.`val` == 9)
    }
}