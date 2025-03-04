
class Solution {
    static{
        for(int i = 0;i < 200;i++){
            characterReplacement("",1);
        }
    }
    public static int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int res = 0,i = 0,maxFreq = 0;

        for(int j = 0;j < s.length();j++){
            int c = s.charAt(j)-'A';
            freq[c]++;
            maxFreq = Math.max(maxFreq,freq[c]);

            while( (j - i + 1 ) - maxFreq > k ){
                char left = s.charAt(i);
                freq[left-'A']--;
                i++;
            }
            res = Math.max(res, (j - i + 1) );
        }

        return res;
    }
}