class Solution {
    public int minOperations(String[] logs) {
        int num = 0;

        for(String s : logs){
            if(s.equals("../")) {
                if(num > 0) num--;
                continue;
            }
            else if (s.equals("./")) continue;
            else num++;
        }
        return num;
    }
}