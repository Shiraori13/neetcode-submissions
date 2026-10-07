class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        if (t.isEmpty() && !s.isEmpty()) return false;
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();

        int p1 = 0;
        int p2 = 0;
        while (p1 < char1.length && p2 < char2.length) {
            if (char1[p1] == char2[p2]) {
                p1++;
                p2++;
            } else {
                p2++;
            }
        }
        return p1 == char1.length;
    }
}