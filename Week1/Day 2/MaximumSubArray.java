class Solution {
    public int maxSubArray(int[] nums) {
            int currentSum = nums[0];
        int anssum = nums[0];
         for(int i = 1; i<nums.length ; i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            anssum = Math.max(anssum, currentSum);
         }
         return anssum;
    }
}
