class Solution {
    public boolean lemonadeChange(int[] bills) {
        int k5 = 0;
        int k10 = 0;
        int k20 = 0;
        int sum = 0;
        int n = bills.length;
        for (int i = 0; i < n; i++) {
            if(bills[i] == 5) k5++;
            else if(bills[i] == 10){
                if (k5 == 0){
                    return false;
                }
                k10++;
                k5--;
            }
            else if(bills[i] == 20){
                if(k10 > 0 && k5 > 0){
                    k10--;
                    k5--;
                }
                else if(k5 >= 3){
                    k5 -= 3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}