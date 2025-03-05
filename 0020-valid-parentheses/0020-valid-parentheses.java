import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> matchingBrackets = Map.of(
            ')', '(', 
            '}', '{', 
            ']', '['
        );

        for (char ch : s.toCharArray()) {
            if (matchingBrackets.containsKey(ch)) {
                if (stack.isEmpty() || stack.pop() != matchingBrackets.get(ch)) {
                    return false;
                }
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
