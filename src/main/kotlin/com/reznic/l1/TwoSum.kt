package com.reznic.l1

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        if (nums.size == 2) {
            return intArrayOf(0, 1)
        }

        for (i in 0..nums.lastIndex) {
            for (x in i + 1..nums.lastIndex) {
                if (nums[i] + nums[x] == target) {
                    return intArrayOf(i, x)
                }
            }
        }
        return intArrayOf(0, 1)
    }
}

fun main() {
    val case1 = Solution().twoSum(intArrayOf(2, 7, 11, 15), 9)
    println(case1.toList())
    assert(case1[0] == 0)
    assert(case1[1] == 1)

    val case2 = Solution().twoSum(intArrayOf(3, 2, 4), 6)
    println(case2.toList())
    assert(case2[0] == 1)
    assert(case2[1] == 2)

    val case3 = Solution().twoSum(intArrayOf(3, 3), 6)
    println(case3.toList())
    assert(case3[0] == 0)
    assert(case3[1] == 1)
}
