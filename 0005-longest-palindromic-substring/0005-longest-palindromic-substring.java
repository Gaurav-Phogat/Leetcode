class Solution {
    public String longestPalindrome(String s) {

        if(s == null || s.length() == 0){
            return "";
        }

        int start = 0;
        int end = 0;

        for(int i = 0;i < s.length(); i++){
            int odd = expandAroundCenter(s,i,i);
            int even = expandAroundCenter(s,i,i+1);
            int maxLength = Math.max(even,odd);

            if(maxLength > end-start){
                start = i - (maxLength-1)/2;
                end = i + maxLength/2;
            }
        }
        return s.substring(start,end+1);
        
    }
    public int expandAroundCenter(String s,int left,int right){
        
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}