package com.reznic.l121

import kotlin.test.Test
import kotlin.test.assertEquals

class BestTimeToBuyAndSellStockTest {

    private val bestTimeToBuyAndSellStock = BestTimeToBuyAndSellStock()

    @Test
    fun maxProfit() {
        assertEquals(5, bestTimeToBuyAndSellStock.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
        assertEquals(0, bestTimeToBuyAndSellStock.maxProfit(intArrayOf(7, 6, 4, 3, 1)))
    }
}