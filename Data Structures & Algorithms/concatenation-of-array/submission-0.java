class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length * 2;
        int[] arr = new int[n];
        int oldSize = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++){
            if (j == oldSize){
                j = 0;
            }
            arr[i] = nums[j++];
        }
        return arr;
    }
}