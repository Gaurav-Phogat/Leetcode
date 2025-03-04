class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] strChars = s.toCharArray();
            Arrays.sort(strChars);
            String tempStr = new String(strChars);
            
            if(!map.containsKey(tempStr)){
                map.put(tempStr,new ArrayList<>());
            }
            map.get(tempStr).add(s);
        }
        List<List<String>> res = new ArrayList<>();

        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }
}