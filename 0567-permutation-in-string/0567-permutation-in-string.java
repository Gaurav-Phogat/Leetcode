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

        if (s1.length() > s2.length()) return false;

    Map<Character, Integer> map1 = new HashMap<>();
    Map<Character, Integer> map2 = new HashMap<>();

    // Populate frequency map for s1
    for (char c : s1.toCharArray()) {
        map1.put(c, map1.getOrDefault(c, 0) + 1);
    }

    // Populate initial window for s2
    for (int i = 0; i < s1.length(); i++) {
        map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);
    }

    // Check equality for the initial window
    if (map1.equals(map2)) return true;

    // Sliding window check
    int j = 0;
    for (int i = s1.length(); i < s2.length(); i++) {
        char outgoing = s2.charAt(j);
        char incoming = s2.charAt(i);
        j++;

        // Adjust outgoing character
        map2.put(outgoing, map2.get(outgoing) - 1);
        if (map2.get(outgoing) == 0) {
            map2.remove(outgoing);
        }

        // Adjust incoming character
        map2.put(incoming, map2.getOrDefault(incoming, 0) + 1);

        // Check map equality
        if (map1.equals(map2)) return true;
    }

    return false;
    }
}