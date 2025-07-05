class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        if(m==0)
            return false;
        int n=matrix[0].length;
        int row=0;
        int col=n-1;
        while(col>=0&&row<m)
        {
            if(matrix[row][col]==target)
                return true;
            if(matrix[row][col]>target)
                col--;
            else 
                row++;
        }
        return false;
    }
}