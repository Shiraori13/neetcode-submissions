class Solution {
    public int findLucky(int[] arr) {
        int[] fre = new int[10000001];
        int max = -1;
        for (int num : arr){
            fre[num]++;
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == fre[arr[i]]){
                max = Math.max(max, arr[i]);
            }
        }
        return max;
    }
}