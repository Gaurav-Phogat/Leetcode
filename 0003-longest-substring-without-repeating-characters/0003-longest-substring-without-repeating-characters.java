class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128];
        int start = 0;
        int end = 0;
        int maxLength = 0;

        for(char strChar : s.toCharArray()){
            if(chars[strChar] == 1){
                for(int i = start;i <= end ; i++){
                    if(s.charAt(i) == strChar){
                        start = i+1;
                        chars[strChar] = 0;
                        break;
                    }
                    chars[s.charAt(i)] = 0;
                }
            }
            end++;
            chars[strChar]++;
            maxLength = Math.max(maxLength,end-start);
        }
        return maxLength;
    }
}