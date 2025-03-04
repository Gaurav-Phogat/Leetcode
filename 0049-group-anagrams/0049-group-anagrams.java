class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<>();

        String[] strings = new String[strs.length];

        for(int i = 0;i < strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            strings[i] = new String(chars);
            if(!map.containsKey(strings[i])){
                map.put(strings[i],new ArrayList<>());
            }
            map.get(strings[i]).add(strs[i]);
        }
        List<List<String>> res = new ArrayList<>();

        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }
}