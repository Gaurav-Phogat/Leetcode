class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        int curMax = 1;
        int curMin = 1;

        for(int n : nums){
            maxProduct = Math.max(maxProduct,n);
        }

        for(int n : nums){
            int temp = curMax*n;

            curMax = Math.max(temp,Math.max(curMin*n,n));
            curMin = Math.min(temp,Math.min(curMin*n,n));

            maxProduct = Math.max(maxProduct,curMax);
        }
        return maxProduct;
    }
}