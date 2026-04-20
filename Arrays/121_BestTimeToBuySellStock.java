class Solution {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int profit = 0;
        int maxprofit = 0;
        for(int i= 0 ; i<prices.length ; i++){
            if(minprice > prices[i]){
                minprice = prices[i];
            }
            profit = prices[i] - minprice  ;
            if(maxprofit < profit){
                maxprofit = profit;
            }
        }
    return maxprofit;}
}
