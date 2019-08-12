class Solution {
    public List<List<String>> solveNQueens(int n) {
        ArrayList<List<String>> res=new ArrayList<List<String>>();
        back(new ArrayList<Integer>(),res,n);
        return res;
        
    }
    private void back(List<Integer> col,List<List<String>> res,int n)
    {
        if(col.size()==n)
        {
            List<String> temp = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                char[] a=new char[n];
                Arrays.fill(a,'.');
                a[col.get(i)]='Q';
                temp.add(new String(a));
            }
            res.add(temp);
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(!col.contains(i)&&!diagonal(col,i))
            {
                col.add(i);
                back(col,res,n);
                col.remove(col.size()-1);
            }
        }
        
    }
    private boolean diagonal(List<Integer> col,int col2)
    {
        int row1=col.size();  //current
        int col1=col2;
        for(int row2=0;row2<col.size();row2++)
        {
            if(Math.abs(row1-row2)==Math.abs(col1-col.get(row2)))
                return true;
        }
        return false;
    }
}