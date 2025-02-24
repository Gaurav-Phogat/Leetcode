class Solution {
    public boolean check(int[] nums) {
        int counter = 0;

        for(int i = 1;i < nums.length;i++){
            if(nums[i] < nums[i-1]){
                counter++;
            }
        }

        if(nums[0] < nums[nums.length-1] && counter > 0) return false;

        return counter <= 1 ? true : false;
    }
}