class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> main=new ArrayList<>();
        ArrayList<Integer>ans=new ArrayList<>();
        seq(nums,ans,0,main);
        return main;
    }
    
    void seq(int[] nums, ArrayList<Integer> ans ,int i,List<List<Integer>> main) {
        if (i==nums.length){
            main.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[i]);
        seq(nums,ans,i+1,main);
        ans.remove(ans.size()-1);
        seq(nums,ans,i+1,main);
}
}
