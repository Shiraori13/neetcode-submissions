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
        while ( right < size){
            char b = s.charAt(right);
            int checkDuplicate = left;

            while (checkDuplicate < right){
                char a = s.charAt(checkDuplicate);
                if (a == b){
                    left = checkDuplicate + 1;
                    break;
                }
                checkDuplicate++;
            }

            count = right - left + 1;
            maxLength = Math.max(maxLength, count);
            right++;
        }

        return maxLength;
    }
}
