class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack();
        for (char c : s.toCharArray()){
            if (c == '(' || c == '[' || c == '{'){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }

                char pr = st.pop();
                if (!((c == ')' && pr == '(') || 
                  (c == ']' && pr == '[') || 
                  (c == '}' && pr == '{')))
                return false;
            }
        }
       return st.isEmpty();
    }
}
