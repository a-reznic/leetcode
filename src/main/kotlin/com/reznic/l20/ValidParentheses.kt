package com.reznic.l20

/**
 * 20. Valid Parentheses
 * <br>
 * @see <a href="https://leetcode.com/problems/valid-parentheses/">leetcode.com/problems/valid-parentheses</a>
 */
class ValidParentheses {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>(s.length)
        s.forEach { char ->
            when (char) {
                '(', '{', '[' -> stack.add(char)
                else -> {
                    if (stack.isEmpty()) return false
                    when (char) {
                        ')' -> if (stack.removeLast() != '(') return false
                        ']' -> if (stack.removeLast() != '[') return false
                        '}' -> if (stack.removeLast() != '{') return false
                    }
                }
            }
        }
        return stack.isEmpty()
    }
}