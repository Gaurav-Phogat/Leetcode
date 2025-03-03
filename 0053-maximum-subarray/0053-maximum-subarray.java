class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int curSum = 0;
        
        for(int n: nums){
            if(curSum < 0){
                curSum = 0;
            }
            curSum += n;
            res = Math.max(res,curSum);
        }

        return res;
    }
}