class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long zero=0;
        int count=0;
        int len = nums.length;
        
        for(int i=0; i<len; i++)
        {
            if(nums[i]==0)
            {
                zero += count + 1;
                count++;
            }
            else
            {
                count=0;
            }
        }
        return zero;
    }
}
