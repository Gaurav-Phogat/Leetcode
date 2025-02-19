class Solution {
    public String longestPalindrome(String s) {

        if(s == null || s.length() == 0){
            return "";
        }
        int start = 0;
        int end = 0;

        for(int i = 0;i < s.length() ; i++){
            int odd = expandString(s,i,i);
            int even = expandString(s,i,i+1);

            int maxLength = Math.max(odd,even);

            if(maxLength > end-start){
                start = i - (maxLength-1)/2;
                end = i + maxLength/2;
            }
        }
        return s.substring(start,end+1);
    }
    public int expandString(String s, int left,int right){

        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            right++;
            left--;
        }
        return right-left-1;
    }
}