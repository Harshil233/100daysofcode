/*
Question:

1) Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */

 class Solution {
    //O(nlogn)
         public int[] twoSum(int[] nums, int target) {
             if(nums == null)
                 return null;
             int[] nums2 = Arrays.copyOf(nums, nums.length);
             Arrays.sort(nums2);
             int a = 0, b = 0;
             int start = 0, end = nums2.length-1;
             //find two nums
             while(start<end){
                 int sum = nums2[start] + nums2[end];
                 if(sum < target)
                     start++;
                 else if(sum > target)
                     end--;
                 else{
                     a = nums2[start]; b = nums2[end];
                     break;
                 }
             }
             //find the index of two numbers
             int[] res = new int[2];
             for(int i = 0; i < nums.length; i++){
                 if(nums[i] == a){
                     res[0] = i;
                     break;
                 }
             }
             if(a != b){
                 for(int i = 0; i < nums.length; i++){
                     if(nums[i] == b){
                         res[1] = i;
                         break;
                     }
                 }
             } else{
                 for(int i = 0; i < nums.length; i++){
                     if(nums[i] == b && i != res[0]){
                         res[1] = i;
                         break;
                     }
                 }
             }
             
             return res;
         }
 }