class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] string1 = s1.toCharArray();
        Arrays.sort(string1);
        int start = 0;

        for(int i = s1.length()-1;i < s2.length();i++){
            char[] temp = (s2.substring(start,i+1)).toCharArray();
            Arrays.sort(temp);
            if(String.valueOf(temp).equals(String.valueOf(string1))) return true;
            else{
                start++;
            }
         //   System.out.println(String.valueOf(temp));
        }
        return false;
    }
}