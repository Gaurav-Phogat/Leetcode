class Solution {
    public String longestPalindrome(String s) {
        String longest = "";

        if(s.length() == 1) return s;

        for(int i = 1;i < s.length();i++){

            String odd = expand(s,i-1,i-1);
            String even = expand(s,i-1,i);

            String bigger = (odd.length() > even.length()) ? odd : even;
            longest = (longest.length() > bigger.length()) ? longest : bigger;
            
        }
        return longest;
    }
    public String expand(String s,int x,int y){
        int left = x;
        int right = y;

        while(left >= 0 && right < s.length()){
            if(s.charAt(left) != s.charAt(right)) return s.substring(left+1,right);
            left--;
            right++; 
        }
        return s.substring(left+1,right);
    }
}