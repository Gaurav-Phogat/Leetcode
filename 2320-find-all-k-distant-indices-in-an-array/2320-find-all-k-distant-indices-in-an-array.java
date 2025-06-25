class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int max = -1;
        List<Integer> list = new ArrayList<>();

        for(int i = 0;i < nums.length;  i++){
            if(nums[i] == key){
                for(int j = ((i-k) > -1) ? i-k : 0;j <= (i+k) && j < nums.length;j++){
                    if(j <= max) continue;
                    else{
                        max = j;
                        list.add(j);
                    }
                }
            }
        }
        return list;
    }
}