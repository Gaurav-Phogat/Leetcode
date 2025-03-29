class Solution {
    public boolean checkInclusion(String s1, String s2) {

        /*
        char[] string1 = s1.toCharArray();
        Arrays.sort(string1);
        int start = 0;

        for(int i = s1.length()-1;i < s2.length();i++){
            char[] temp = (s2.substring(start,i+1)).toCharArray();
            Arrays.sort(temp);
            if(String.valueOf(temp).equals(String.valueOf(string1))) return true;
            else{
                start++;
            }
        }
        return false;
         */

        //hashmap approach

        if(s1.length() > s2.length()) return false;

        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();

        for(char c : s1.toCharArray()){
            if(map1.containsKey(c)){
                map1.put(c,map1.get(c)+1);
            } else{
                map1.put(c,1);
            }
        }

      //  System.out.println(map1);

        for(int i = 0;i < s1.length();i++){
            if(map2.containsKey(s2.charAt(i))){
                map2.put(s2.charAt(i),map2.get(s2.charAt(i))+1);
            } else{
                map2.put(s2.charAt(i),1);
            }
        }

        if(map1.equals(map2)) return true;

      //  System.out.println(map2);

        int j = 0;

        for(int i = s1.length();i < s2.length(); i++){
            if(map2.get(s2.charAt(j)) == 1){
                map2.remove(s2.charAt(j));
            } else{
                map2.put(s2.charAt(j),map2.get(s2.charAt(j))-1);
            }
            if(map2.containsKey(s2.charAt(i))){
                map2.put(s2.charAt(i),map2.get(s2.charAt(i))+1);
            } else{
                map2.put(s2.charAt(i),1);
            }
            j++;
            if(map1.equals(map2)) return true;
        }
        return false;
    }
}