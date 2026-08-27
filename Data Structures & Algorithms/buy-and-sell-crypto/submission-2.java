class Solution {
    public static int maxProfit(int[] prices) {
        int minValue = 0;
        int maxProfit = 0;
        for(int i = 0; i <prices.length; i++){
            if(i == 0){
                minValue = prices[0];
            }
            minValue = Math.min(minValue,prices[i]);
            if(prices[i] > minValue){
                maxProfit = Math.max(maxProfit,prices[i]-minValue);
            }
        }
        return maxProfit;
    }
}
