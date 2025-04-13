
class Solution {
    public static int characterReplacement(String s, int k) {
        
        int[] freq = new int[26];
        int longest = 0;
        int maxFreq = 0;
        int start = 0;

        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i)-'A']++;
            maxFreq = Math.max(maxFreq,freq[s.charAt(i)-'A']);

            if((i-start+1)-maxFreq > k){
                freq[s.charAt(start)-'A']--;
                start = start+1;
            }
            longest = Math.max(longest,i-start+1);
        }
        return longest;
    }
}