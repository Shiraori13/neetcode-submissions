class Solution {
    public int[] addToArrayForm(int[] num, int k) {
        // if(num[0] == 0 && k == 10000 && num.length == 1) return new int[]{1,0,0,0,0};
        int mem = 0;
        
        String s = "";
        for(int i = num.length - 1; i >= 0 ; i--){
            int sum = 0;
            if (i == num.length - 1){
                sum = num[i] + k + mem;
            }
            else{
                sum = num[i] + mem;
            }
            
            int back = sum % 10;
            mem = sum / 10;
            s += back;
        }
        while(mem > 0){
            s += (mem % 10);
            mem /= 10;   
        }
    int[] res = new int[s.length()];
    int j = 0;
    for (int i = s.length() -  1; i >= 0; i--){
        res[j++] = s.charAt(i) - '0';
    }
    return res;
    }
}
