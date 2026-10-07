class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> list = new LinkedList<>();
        int n = nums.length;
        for (int i = 0; i < n - 2; i++){
            if (i == 0 || i > 0 && nums[i] != nums[i - 1]){
                int l = i + 1;
                int r = n - 1;
                int target = 0 - nums[i];
                while(l < r){
                    if (nums[l] + nums[r] == target){
                        list.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        while(l < r && nums[l] == nums[l + 1]) l++;
                        while(l < r && nums[r] == nums[r - 1]) r--;
                        l++;
                        r--;
                    }
                    else if (nums[l] + nums[r] > target) r--;
                    else l++;
                }
            }
        }
        return list;
    }
}
