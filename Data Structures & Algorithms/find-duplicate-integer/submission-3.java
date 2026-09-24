class Solution {
    public int findDuplicate(int[] nums) {
        int length = nums.length;
        if (nums[length - 1] == nums[length - 2])
            return nums[length - 1];
        int result = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] == nums[j]) {
                    result = nums[i];
                    break;
                }
            }
        }
        return result;
    }
}
