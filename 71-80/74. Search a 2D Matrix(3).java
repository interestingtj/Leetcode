class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0;
        int right=matrix.length*matrix[0].length-1;
        while(left<=right){
            int mid=(left+right)/2;
            int x=mid/n;
            int y=mid%n;
            if(matrix[x][y]==target){
                return true;
            }
            else if(matrix[x][y]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
    }
}