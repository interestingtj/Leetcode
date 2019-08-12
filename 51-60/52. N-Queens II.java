class Solution {
    public int totalNQueens(int n) {
        int[] col=new int[n];
        int[] col2=new int[n];
        int[] res=new int[1];
        res[0]=0;
        Arrays.fill(col2,0);
        back(col,col2,res,n,0);
        return res[0];
        
    }
    private void back(int[] col,int[] col2,int[] res,int n,int count)
    {
        if(count==n)
        {
            res[0]+=1;
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(col2[i]!=1&&!diagonal(col,i,count))
            {
                col2[i]=1;
                col[count]=i;
                back(col,col2,res,n,count+1);
                col2[i]=0;
            }
        }
        return;
        
    }
    private boolean diagonal(int[] col,int col2,int count)
    {
        int row1=count;  //current
        int col1=col2;
        for(int row2=0;row2<count;row2++)
        {
            if(Math.abs(row1-row2)==Math.abs(col1-col[row2]))
                return true;
        }
        return false;
    }
}