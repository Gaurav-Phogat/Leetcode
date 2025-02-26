class Solution {
    public boolean backspaceCompare(String s, String t) {

    return removeHash(s).equals(removeHash(t));
    }
    public String removeHash(String input){

        StringBuilder string = new StringBuilder();

        for(char curChar : input.toCharArray()){
            if(curChar == '#'){
                if(string.length() > 0){
                    string.deleteCharAt(string.length()-1);
                }
            } else {
                string.append(curChar);
            }
        }
        return string.toString();
    }
}