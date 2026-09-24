class Solution {
    public int findDuplicate(int[] nums) {
        int length = nums.length;
        if(nums[length - 1] == nums[length - 2] || nums[length - 1] == nums[length - 3]) return nums[length - 1];
        Arrays.sort(nums);
        int result = 0;
        for(int i = 0; i < length - 1; i++){
            if (nums[i + 1] == nums[i]){
                result = nums[i];
                break;
            }
        }
        return result;
    }
}
