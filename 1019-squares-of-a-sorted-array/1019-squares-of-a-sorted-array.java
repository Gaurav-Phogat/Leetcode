class Solution {
    public int[] sortedSquares(int[] nums) {
        // find closest to 0 and then use two pointers and add things to new array that way.
        int left = 0;
        int right = nums.length-1;
        int[] ans = new int[nums.length];

        int index = nums.length-1;

        while(index != -1){

            if(nums[left]*nums[left] > nums[right]*nums[right]){
                ans[index] = nums[left]*nums[left];
                left++;
            } else {
                ans[index] = nums[right]*nums[right];
                right--;
            }
            index--;
        }
        return ans;
    }
}