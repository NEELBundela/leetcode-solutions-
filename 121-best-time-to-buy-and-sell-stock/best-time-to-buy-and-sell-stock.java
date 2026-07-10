class Solution {
    public int maxProfit(int[] prices) {
        int minprice=prices[0],maxprofit=0,profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minprice){
                minprice=prices[i];
            }
            profit=prices[i]-minprice;

            if(profit>maxprofit){
                maxprofit=profit;
            }
        }
        return maxprofit;

    }
}