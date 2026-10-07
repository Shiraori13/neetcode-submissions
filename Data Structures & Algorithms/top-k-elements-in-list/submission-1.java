class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        for (int num : nums){
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new List[n + 1];
        for (int key : mp.keySet()){
            int fre = mp.get(key);
            if (bucket[fre] == null){
                bucket[fre] = new ArrayList<>();
            }
            bucket[fre].add(key);
        }

        int[] res = new int[k];
        int idx = 0;

        for (int i = bucket.length - 1; i >= 0 && idx < k; i--){
            if (bucket[i] != null){
                for (int num : bucket[i]){
                    res[idx++] = num;
                    if(idx == k) break;
                }
            }
        }
        return res;
    }
}
