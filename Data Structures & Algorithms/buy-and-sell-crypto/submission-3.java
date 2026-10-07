class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int n = prices.length;
        int max = 0;
        while(r < n){
            if (prices[l] > prices[r]){
                l = r;
            }
            if(prices[r] - prices[l] >= max
             && prices[l] < prices[r]){
                max = prices[r] - prices[l];
            }
            r++;
        }
        return max;
    }
}
