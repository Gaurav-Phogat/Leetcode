class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        for(int i = 0;i < nums.length;  i++){
            if(nums[i] == key){
                set.add(i); // 2
                for(int j = i-1; (j > -1) && j >= (i - k); j--){
                    set.add(j);
                }
                for(int j = i; j < nums.length && j <= (i + k);j++){
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