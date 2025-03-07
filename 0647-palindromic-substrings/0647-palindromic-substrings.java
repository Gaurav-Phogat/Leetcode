class Solution {

    int answer = 0;

    public int countSubstrings(String s) {

        for(int i = 1;i < s.length();i++){
            expand(s,i-1,i-1);
            expand(s,i-1,i);
        }
        return answer+1;
    }
    public void expand(String str,int x,int y){
        int left = x;
        int right = y;

        while(left >= 0 && right < str.length()){
            if(str.charAt(left) != str.charAt(right)) return;
            answer++;
            left--;
            right++;
        }
    }
}