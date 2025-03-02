class Solution {
    public int maxProduct(int[] nums) {
        
        // [2,3,-2,4,5]

        int maxProduct = Integer.MIN_VALUE; // 2 // 6
        int curMax = 1; // 2 // 6 // 6 // 4 // 20
        int curMin = 1; // 2 // 3 // -12 // -48 // -240

        for(int n: nums){
            maxProduct = Math.max(maxProduct,n);
        }

        for(int i = 0 ;i < nums.length;i++){
            int temp = curMax * nums[i];
            curMax = Math.max(temp,Math.max(curMin*nums[i],nums[i]));  
            curMin = Math.min(temp,Math.min(curMin*nums[i],nums[i]));
            maxProduct = Math.max(maxProduct,curMax);
        }
        return maxProduct;
    }
}