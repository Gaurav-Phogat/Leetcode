class Solution {
    public int maxProfit(int[] prices) {
        int smallest = Integer.MAX_VALUE;
        int profit = 0;

        for(int price : prices){
            profit = Math.max(profit,price-smallest);
            if(smallest > price){
                smallest = price;
            }
        }
        return profit;
    }
}