class Solution {
    public boolean isPalindrome(String s) {

        String newString = "";
        
        for (int i  = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (Character.isAlphabetic(c) || Character.isDigit(c)){
                newString += c;
            }
        }
        newString = newString.toLowerCase();
        int i = 0;
        int j = newString.length() - 1;
        while(i <= j){
            char a = newString.charAt(i);
            char b = newString.charAt(j);
            
            if (a != b){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
