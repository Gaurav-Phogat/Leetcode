class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> set = new LinkedHashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int i = 0;i < nums.length;  i++){
            if(nums[i] == key){
                for(int j = ((i-k) > -1) ? (i-k) : 0 ; j < i ; j++){
                    set.add(j);
                }
                set.add(i);
                for(int j = ((i+1) < nums.length) ? i+1 : nums.length-1 ; j < nums.length && j <= i+k ;j++ ){
                    set.add(j);
                }
                
            }
        }

        for(int n: set){
            list.add(n);
        }

        return list;
    }
}