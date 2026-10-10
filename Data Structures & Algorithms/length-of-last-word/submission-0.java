class Solution {
    public int lengthOfLastWord(String s) {
        String[] newString = s.trim().split("\\s+");

        String lastWord = newString[newString.length - 1];

        return lastWord.length();
    }
}