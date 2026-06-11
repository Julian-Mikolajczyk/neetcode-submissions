class Solution {
  public static int maxProfit(int[] prices) {
    int l = 0, r = 1, profit = 0;
    while(r < prices.length){
      if(prices[l] < prices[r]){
        int tempProfit = prices[r] - prices[l];
        if(tempProfit > profit){
          profit = tempProfit;
        }
      }else{
        l = r;
      }
      r++;
    }
    return profit;
  }
}
