class Solution {
    public int dominantIndex(int[] nums) {
        int result = -1, tmp = -1, ans = -1;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > result) {
                tmp = result;
                result = nums[i];
                ans = i;
            } else if (nums[i] > tmp) 
                tmp = nums[i];
        }
        return result >= tmp * 2 ? ans : -1;
    }
}
