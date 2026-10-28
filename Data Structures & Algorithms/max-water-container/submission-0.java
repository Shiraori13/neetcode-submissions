class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int max = 0;
        while(l < r){
            int container = Math.abs(r - l);
            int height = Math.min(heights[l], heights[r]);

            int total = container * height;
            
            max = Math.max(max, total);
            if (heights[l] < heights[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}
