class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        if(m==0)
            return false;
        int n=matrix[0].length;
        if(n==0)
            return false;
        int row=0,col=0;
        int low=0,high=m*n-1;
        int mid;
        while(low<=high)
        {
            mid=(low+high)/2;
            row=mid/n;
            col=mid%n;
            if(matrix[row][col]==target)
                return true;
            if(matrix[row][col]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        return false;

    }
}