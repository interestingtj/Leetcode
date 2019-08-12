class Solution {
    public int uniquePaths(int m, int n) {
        int count=0;
        count=path(count,m,n,1,1);
        return count;
    }
    private int path(int count,int m,int n,int row,int col)
    {
        if(row==n&&col==m)
            return 1;
        if(row>n||col>m)
            return 0;
        row++;
        int a=path(count,m,n,row,col);
        row--;
        col++;
        int b=path(count,m,n,row,col);
        col--;
        return a+b;
    }
}