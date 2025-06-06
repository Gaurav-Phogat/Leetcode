class Solution {
    public int maxSubArray(int[] nums) {
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int n : nums){
            maxSum = Math.max(maxSum,n);
        }

        for(int n : nums){
            curSum += n;
            maxSum = Math.max(maxSum,curSum);

            if(curSum < 1){
                curSum = 0;
            }
        }
        return maxSum;
    }
}