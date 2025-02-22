class Solution {
    public String removeOccurrences(String s, String part) {
        // sliding window for finding and make a new string with string builder excluding the find parts and keep going and return remaining string in string builder.

        // exit condition -> reached end without finding.

      /*  if(s.length() < part.length()) return s;

        StringBuilder sb = new StringBuilder(s);

        int left = 0;
        int right = part.length();

        while(sb.length() != 0 && right <= sb.length()){

            if(sb.substring(left,right).equals(part)){
                sb.delete(left,right);
            } else {
                left++;
                right++;
                continue;
            }
            left = 0;
            right = part.length();
        }
    return sb.toString(); */

    
        //int n = s.length();
        int index = s.indexOf(part);
        while(index != -1) {
            s = s.substring(0, index) + s.substring(index + part.length());
           // n = s.length();
            index = s.indexOf(part);
        }
        return s;
    }
}