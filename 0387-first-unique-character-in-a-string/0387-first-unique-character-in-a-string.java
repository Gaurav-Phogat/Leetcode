class Solution {
    public static int firstUniqChar(String s) {
        int[] chars = new int[26];

        for(char c : s.toCharArray()){
            chars[c-'a']++;
        }
        for(int i = 0;i < s.length();i++){
            if(chars[s.charAt(i)-'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}