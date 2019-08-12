class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];
        int a=1;
        int l1=n-1,l2=n-1,l3=0,l4=0;   //l1,l3 col  l2,l4 row
        while(a<=n*n)
        {
            for(int i=l3;i<=l1;i++)
            {
                res[l4][i]=a;
                a++;
            }
            for(int i=l4+1;i<=l2;i++)
            {
                res[i][l1]=a;
                a++;
            }
            for(int i=l2-1;i>=l3;i--)
            {
                res[l2][i]=a;
                a++;
            }
            for(int i=l1-1;i>l4;i--)
            {
                res[i][l3]=a;
                a++;
            }
            l1--;
            l2--;
            l3++;
            l4++;
        }
        return res;
    }
}