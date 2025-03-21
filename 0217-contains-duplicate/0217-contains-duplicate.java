class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> freq = new HashSet<>();

        for(int n : nums){
            if(freq.contains(n)) return true;
            freq.add(n);
        }
        return false;
    }
}