class Solution {
    public int jump(int[] nums) {
        int n = nums.length; 
        int jumps = 0; 
        int curEnd = 0; 
        int curFarthest = 0; 
        for (int i = 0; i < n - 1; i++) {
            curFarthest = Math.max(curFarthest, i + nums[i]); 
            if (i == curEnd) {
                jumps++; 
                curEnd = curFarthest; 
            }
        }
        return jumps;
    }
}
