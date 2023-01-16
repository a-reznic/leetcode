package com.reznic.l125

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidPalindromeTest {
    private val solution = ValidPalindrome()

    @Test
    fun isPalindrome() {
        assertFalse(solution.isPalindrome("0P"))
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"))
        assertTrue(solution.isPalindrome(" "))
        assertFalse(solution.isPalindrome("race a car"))
        assertFalse(solution.isPalindrome("A mda"))
    }
}