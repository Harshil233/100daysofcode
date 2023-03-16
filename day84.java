class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(nums.length==1)
          return nums[0];
        for(int i=2; i<n; i++){
            nums[i] = Math.max(nums[i]+nums[i-2],nums[i-1]);
            nums[i-1] = Math.max(nums[i-1],nums[i-2]);
        }
        return Math.max(nums[n-1],nums[n-2]);
    }
}
