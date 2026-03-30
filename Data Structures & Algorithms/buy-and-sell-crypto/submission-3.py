class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxProfit = 0
        buy,sell = 0,1
        n = len(prices)
        while buy < n-1:
            profit = prices[sell] - prices[buy]
            if profit < 0:
                buy+=1
                sell=buy+1
            else:
                maxProfit = max(maxProfit,profit)
                sell+=1
            
            if sell >= n:
                buy+=1
                sell=buy+1            
        return maxProfit