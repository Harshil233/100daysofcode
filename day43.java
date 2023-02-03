class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix[0].length;
        int n = matrix.length;
        int low = 0,high = m*n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(matrix[mid/m][mid%m]==target)
            return true;
            if(matrix[mid/m][mid%m]<target)
            low = mid+1;
            else
            high = mid-1;
        }return false;
    }
}
