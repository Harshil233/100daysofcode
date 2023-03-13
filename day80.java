class Solution {
    public int findPeakElement(int[] nums) {
        int i = 0;
        int j = 0;
        if (nums.length == 1) {
            return 0;
        }

        while (j < nums.length) {
            if (j < nums.length) {
                j++;
            }
            if (j < nums.length && nums[i] > nums[j]) {
                return i;
            } else if (nums[j] > nums[i] && j == nums.length - 1) {
                return j;
            }
            i++;
        }
        return 0;
    }
}
