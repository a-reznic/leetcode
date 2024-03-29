package com.reznic.l1

import kotlin.test.Test

class TwoSumTest {

    @Test
    fun twoSum() {
        val case1 = TwoSum().twoSum(intArrayOf(2, 7, 11, 15), 9)
        println(case1.toList())
        assert(case1[0] == 0)
        assert(case1[1] == 1)

        val case2 = TwoSum().twoSum(intArrayOf(3, 2, 4), 6)
        println(case2.toList())
        assert(case2[0] == 1)
        assert(case2[1] == 2)

        val case3 = TwoSum().twoSum(intArrayOf(3, 3), 6)
        println(case3.toList())
        assert(case3[0] == 0)
        assert(case3[1] == 1)
    }
}