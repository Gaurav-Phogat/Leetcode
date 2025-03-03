class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0;i < prices.length;i++){
            if(smallest > prices[i]){
                smallest = prices[i];
            }
            maxProfit = Math.max(maxProfit,prices[i]-smallest);
        }
        return maxProfit;
    }
}