class Solution {
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int curSum = 0;

        for(int n : nums){
            curSum += n;
            res = Math.max(res,curSum);

            if(curSum < 0){
                curSum = 0;
            } 
        }
        return res;
    }
}