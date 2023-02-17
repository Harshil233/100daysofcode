class Solution {
    public List<Integer> getRow(int r) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        long temp = 1;
        int up,down=1;
        up=r;
        for(int i=1;i<=r;i++){
            temp=temp*up/down;
            ans.add((int)temp);
            up--;
            down++;
        }
        return ans;
    }
}
