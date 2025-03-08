class Solution {
    public int maxProfit(int[] prices) {
        int smallest = prices[0];
        int maxProfit = 0;

        for(int p : prices){
            maxProfit = Math.max(maxProfit,p-smallest);
            if(smallest > p){
                smallest = p;
            }
        }
        return maxProfit;
    }
}