class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        int[] ans = new int[Math.min(nums1.length,nums2.length)];

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n : nums1){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            } else {
                map.put(n,1);
            }
        }
        int count = 0;

        for(int n : nums2){
            if(map.containsKey(n) && map.get(n) > 0){
                map.put(n,map.get(n)-1);
                ans[count++] = n;
            }
        }

        return Arrays.copyOfRange(ans,0,count);
    }
}