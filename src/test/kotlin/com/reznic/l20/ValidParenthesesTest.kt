package com.reznic.l20

import kotlin.test.Test


class ValidParenthesesTest {

    @Test
    fun test() {
        val validParentheses = ValidParentheses()
        assert(!validParentheses.isValid("]"))
        assert(validParentheses.isValid("()"))
        assert(validParentheses.isValid("[]"))
        assert(validParentheses.isValid("{}"))
        assert(validParentheses.isValid("{}[]"))
        assert(!validParentheses.isValid("{]"))
        assert(!validParentheses.isValid("([)]")) { "([)]  != false" }
        assert(validParentheses.isValid("{[]}")) { "{[]}  != true" }
    }
}