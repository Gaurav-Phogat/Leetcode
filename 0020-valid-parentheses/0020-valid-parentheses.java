class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty()) {
                char temp = stack.peek();
                if(isPair(temp,c)){
                    stack.pop();
                    continue;
                }
            }
            stack.push(c);
        }
        return stack.isEmpty();
    }
    public boolean isPair(Character last,Character c){
        return (last == '{' && c == '}' ||
                last == '(' && c == ')' ||
                last == '[' && c == ']');
    }
}