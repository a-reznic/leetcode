package com.reznic.l121

/**
 * 121. Best Time to Buy and Sell Stock
 * <br>
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">leetcode.com/problems/best-time-to-buy-and-sell-stock</a>
 */
class BestTimeToBuyAndSellStock {

    fun maxProfit(prices: IntArray): Int {
        var min: Int = prices[0]
        var profit: Int = 0

        for (value in prices) {
            min = Math.min(min, value)
            profit = Math.max(profit, value - min)
        }

        return profit
    }
}