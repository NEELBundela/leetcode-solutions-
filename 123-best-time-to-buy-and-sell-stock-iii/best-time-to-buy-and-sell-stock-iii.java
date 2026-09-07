class Solution {
    public int maxProfit(int[] prices) {
        int buy1=Integer.MAX_VALUE;
        int sell1 = 0;

        int buy2=Integer.MAX_VALUE;
        int sell2 = 0;      

        for(int price : prices){
            buy1=Integer.min(buy1,price);
            sell1=Integer.max(sell1,price-buy1);

            buy2=Integer.min(buy2,price-sell1);
            sell2=Integer.max(sell2,price-buy2);
        }
        return sell2;
    }
}