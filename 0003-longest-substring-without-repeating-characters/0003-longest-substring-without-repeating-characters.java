class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length() == 0) return 0; 

        int[] chars = new int[128];
        Arrays.fill(chars,-1);
        int longest = 0;
        int start = 0;

        for(int i = 0;i < s.length();i++){
            if(chars[s.charAt(i)] >= start){
                start = chars[s.charAt(i)]+1; 
            }
            chars[s.charAt(i)] = i;
            longest = Math.max(longest,i-start+1);
        }
        return longest;
    }
}