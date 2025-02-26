class Solution {
    public int rob(int[] nums) {
        int maxRob = 0;
        int prevRob = 0;

        for(int curVal : nums){
            int temp = Math.max(maxRob,prevRob + curVal);
            prevRob = maxRob;
            maxRob = temp;
        }
        return maxRob;
    }
}