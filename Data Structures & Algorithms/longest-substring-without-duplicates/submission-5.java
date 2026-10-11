class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()){
            return 0;
        }
        if (s.length() == 1) return 1;
        int left = 0;
        int right = left + 1;
        int count = 1;
        int maxLength = 1;
        int size = s.length();
        Set<Character> set = new HashSet<>();
        set.add(s.charAt(left));

        while (right < size){
           char b = s.charAt(right);

           while(set.contains(b)){
            set.remove(s.charAt(left));
            left++;
           }

           set.add(b);
           count = right - left + 1;
           maxLength = Math.max(maxLength, count);

           right++;
        }
        return maxLength;
    }
}
