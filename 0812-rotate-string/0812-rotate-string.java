class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length() != goal.length()) return false;

        if(s == null) return false;

        String check = s+s;

        return check.contains(goal);
    }
}