class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i < s.length();i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }
            else if(stack.peek() == '(' && s.charAt(i) == ')'){
                stack.pop();
                continue;
            }
            else if(stack.peek() == '{' && s.charAt(i) == '}'){
                stack.pop();
                continue;
            }
            else if(stack.peek() == '[' && s.charAt(i) == ']'){
                stack.pop();
                continue;
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty() ? true : false;
    }
}