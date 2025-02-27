class Solution {
    public String clearDigits(String s) {
        List<Character> stack = new ArrayList<>();

        for(char c : s.toCharArray()){
            if(c >= '0' && c <= '9'){
                if(stack.size() > 0){
                    stack.remove(stack.size()-1);
                }
            } else {
                stack.add(c);
            }
        }

        StringBuilder res = new StringBuilder();

        for(char c : stack) {
            res.append(c);
        }
        return res.toString();
    }
}