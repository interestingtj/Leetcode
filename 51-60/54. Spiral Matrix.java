class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        int len1=matrix.length;
        if(len1==0)
            return res;
        int len2=matrix[0].length;
        int min=Math.min(len1,len2)-1;
        int l1=len2-1,l2=len1-1,l3=0,l4=1;
        while(l1>=l3&&l2>=(l4-1))
        {
            for(int i=l3;i<=l1;i++)
                res.add(matrix[l4-1][i]);
            for(int i=l4;i<=l2;i++)
                res.add(matrix[i][l1]);
            if(l1>l3&&l2>(l4-1))
            {
                for(int i=l1-1;i>=l3;i--)
                    res.add(matrix[l2][i]);
                for(int i=l2-1;i>=l4;i--)
                    res.add(matrix[i][l3]);
            }
            l1--;
            l2--;
            l3++;
            l4++;
        }
        return res;
    }
}