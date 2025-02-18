class Solution {

    List<Integer> ans = new ArrayList<>();

    public int lengthOfLIS(int[] nums) {
        for(int n : nums){
            if(!ans.isEmpty()){
                if(ans.get(ans.size()-1) >= n){
                    replace(n);
                } else {
                    ans.add(n);
                }
            } else {
                ans.add(n);
            }
        }
        return ans.size();
    }
    public void replace(int target){
        int left = 0;
        int right = ans.size()-1;

        while(left<=right){
            int mid = left+(right-left)/2;

            if(ans.get(mid) == target){
                ans.set(mid,target);
                return;
            } else if(ans.get(mid) < target){
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        ans.set(left,target);
    }
}