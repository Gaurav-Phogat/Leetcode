class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int last = -1;
        List<Integer> list = new ArrayList<>();

        for(int i = 0;i < nums.length;  i++){
            if(nums[i] == key){
                // start must be bigger then the last value added to lsit always
                int start = (i-k) > last ? ((i-k) >= 0 ? (i-k) : 0) : last+1;
                for(int j = start;j <= (i+k) && j < nums.length;j++){
                    last = j;
                    list.add(j);
                }
            }
        }
        return list;
    }
}