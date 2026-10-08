class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();

        for (String s : words){
            for(String w : words){
                if (s != w && w.contains(s)){
                    res.add(s);
                    break;
                }
            }
        }
        return res;
    }
}