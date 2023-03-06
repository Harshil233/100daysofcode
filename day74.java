class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] num = new int[k];
        int i = 0, j = 0, x = 1;
        while (j < k) {
            if (i < arr.length && arr[i] == x) {
                i++;
                x++;
            } else {
                num[j] = x;
                j++;
                x++;
            }
        }
        return num[k - 1];
    }
}
