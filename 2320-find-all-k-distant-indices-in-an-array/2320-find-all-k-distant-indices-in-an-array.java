class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int max = -1;
        List<Integer> list = new ArrayList<>();

        for(int i = 0;i < nums.length;  i++){
            if(nums[i] == key){
                int start = (i-k) > max ? ((i-k) >= 0 ? (i-k) : 0) : max+1;
                for(int j = start;j <= (i+k) && j < nums.length;j++){
                    max = j;
                    list.add(j);
                }
            }
        }
        return list;
    }
}