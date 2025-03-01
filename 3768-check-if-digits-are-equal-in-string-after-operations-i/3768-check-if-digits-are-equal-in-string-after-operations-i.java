class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        while(sb.length() > 2){
            StringBuilder curr = new StringBuilder();
            int size = sb.length();
            
            for(int i = 0;i < size-1;i++){
                int total = Character.getNumericValue(sb.charAt(i));

                if(i+1 < size){
                    total += Character.getNumericValue(sb.charAt(i+1));
                }
                curr.append(total%10);
            }
            sb.setLength(0);
            sb.append(curr);
        }
        int check1 = (int) sb.charAt(0);
        int check2 = (int) sb.charAt(1);
        if(check1 == check2) return true;
        return false;
    }
}