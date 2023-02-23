class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int ele = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(count == 0){
                ele = nums[i];
            }
            count += (nums[i] == ele)?1:-1;
        }
        return ele;
    }
}
