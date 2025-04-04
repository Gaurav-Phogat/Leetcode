class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        int curPro = 1;
        int minPro = 1;

        for(int n : nums){
            maxProduct = Math.max(maxProduct,n);
        }

        for(int n: nums){
            int temp = curPro*n;

            curPro = Math.max(temp,Math.max(minPro*n,n));
            minPro = Math.min(temp,Math.min(minPro*n,n));

            maxProduct = Math.max(maxProduct,curPro);
        }
        return maxProduct;
    }
}