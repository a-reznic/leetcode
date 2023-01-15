package com.reznic.l1

/**
 * 1. Two Sum
 * <br>
 *  @see <a href="https://leetcode.com/problems/two-sum/">leetcode.com/problems/two-sum/</a>
 */
class TwoSum {
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
