package com.reznic.l121

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