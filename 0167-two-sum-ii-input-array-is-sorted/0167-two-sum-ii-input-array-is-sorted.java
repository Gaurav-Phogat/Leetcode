class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;

        while(left < right){
            int total = numbers[left] + numbers[right];

            if(total > target){
                right--;
            }
            else if(total < target){
                left++;
            } else {
                break;
            }
        }
        int[] ans = new int[2];
        ans[0] = left+1;
        ans[1] = right+1;
        return ans;
    }
}