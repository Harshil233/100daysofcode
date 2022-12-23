class Solution {
    public int findLucky(int[] arr) {
        int[] count = new int[501];
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            num = arr[i];
            count[num]++;
        }
        
        int res = 0;
        for(int i = 500; i >= 1; i--){
            if(count[i] == i){
                return i;
            }
        }
        return -1;
    }
}
