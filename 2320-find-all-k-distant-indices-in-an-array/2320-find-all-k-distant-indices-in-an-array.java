class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> set = new LinkedHashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int i = 0;i < nums.length;  i++){
            if(nums[i] == key){
                for(int j = ((i-k) > -1) ? i-k : 0;j <= (i+k) && j < nums.length;j++)
                set.add(j);
            }
        }

        for(int n: set){
            list.add(n);
        }

        return list;
    }
}