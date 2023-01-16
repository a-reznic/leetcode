package com.reznic.l125

/**
 * 125. Valid Palindrome
 * <br>
 * @see <a href="https://leetcode.com/problems/valid-palindrome/">leetcode.com/problems/valid-palindrome</a>
 */
class ValidPalindrome {
    fun isPalindrome(s: String): Boolean {
        val replace = s.replace(Regex("[^A-Za-z0-9]"), "").toLowerCase()
        if (replace.isEmpty()) {
            return true
        }
        for (i in 0..replace.length / 2) {
            if (replace[i] != replace[replace.length - 1 - i]) {
                return false
            }
        }
        return true
    }
}