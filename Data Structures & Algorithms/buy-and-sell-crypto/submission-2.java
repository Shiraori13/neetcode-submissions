class Solution {
    public int maxProfit(int[] prices) {
        int size = prices.length;

        int l = 0;
        int r = 1;
        int result = 0;
        while( r < size ){
            if (prices[l] > prices[r]){
                l = r;
            }
            else if (prices[l] < prices[r] 
                && result <= (prices[r] - prices[l])){
                result = prices[r] - prices[l];
            }
            r++;
        }
        return result;
    }
}
