class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        re(res,new int[k],0,k,1,n);
        return res;
    }
    private void re(List<List<Integer>> res,int[] temp,int count,int k,int start,int n)
    {
        if(count==k)
        {
            List<Integer> a=new ArrayList<>();
            for(int i=0;i<k;i++)
                a.add(temp[i]);
            res.add(a);
            return;
        }
        for(int i=start;i<=n-k+1+count;i++)
        {
            temp[count]=i;
            re(res,temp,count+1,k,i+1,n);
        }
    }
}