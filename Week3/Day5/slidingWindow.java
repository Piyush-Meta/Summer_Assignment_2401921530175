class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        for (int start = 0; start <= nums.length - k; start++) {
            int max = nums[start];
            for (int i = start; i < start + k; i++) {
                max = Math.max(max, nums[i]);
            }
            ans[start] = max;
        }
        return ans;
    }
}
