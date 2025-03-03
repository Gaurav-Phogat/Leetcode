class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        Arrays.fill(prefix,1);
        Arrays.fill(suffix,1);
        int n = nums.length;

        for(int i = 1;i < n;i++){
            prefix[i] = prefix[i-1]*nums[i-1];
        }
        for(int i = n-2;i>=0;i--){
            suffix[i] = suffix[i+1]*nums[i+1];
        }

        for(int i = 0;i < n ;i++){
            nums[i] = prefix[i]*suffix[i];
        }
        return nums;
    }
}