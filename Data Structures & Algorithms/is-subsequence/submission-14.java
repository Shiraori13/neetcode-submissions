class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();

        int i = 0;

        for (int j = 0; j < tLength && i < sLength; j++){
            if (s.charAt(i) == t.charAt(j)){
                i++;    
            }
        }
        return i == sLength;
    }
}