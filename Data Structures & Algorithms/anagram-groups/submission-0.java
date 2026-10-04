class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();

        for (String str : strs){
            char[] c = new char[26];
            for(char cha : str.toCharArray()) c[cha - 'a']++;

            String key = new String(c);

            if (!mp.containsKey(key)){
                mp.put(key, new ArrayList<>());
            }
            mp.get(key).add(str);
        }
        return new ArrayList<>(mp.values());
    }
}
