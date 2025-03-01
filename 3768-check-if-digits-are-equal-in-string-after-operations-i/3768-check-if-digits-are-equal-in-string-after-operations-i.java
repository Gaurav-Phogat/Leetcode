class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        
        while (sb.length() > 2) {
            int size = sb.length();
            
            // Reuse the existing StringBuilder
            for (int i = 0; i < size - 1; i++) {
                int total = Character.getNumericValue(sb.charAt(i)) + Character.getNumericValue(sb.charAt(i + 1));
                sb.setCharAt(i, (char) ('0' + (total % 10)));
            }
            
            sb.setLength(size - 1); // Reduce the length of sb
        }
        
        return sb.length() == 2 && sb.charAt(0) == sb.charAt(1);
    }
}
