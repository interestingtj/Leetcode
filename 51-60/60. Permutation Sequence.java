class Solution {
    public String getPermutation(int n, int k) {
        int group;
        k--;
        List<Integer> nums=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
            nums.add(i+1);
        int fac=factorial(n);
        StringBuffer sb=new StringBuffer();
        while(n>0)
        {
            fac=fac/n;
            group=k/fac;
            k%=fac;
            sb.append(nums.get(group));
            nums.remove(group);
            n--;
        }
        return sb.toString();
        
    }
    private int factorial(int n) //jiecheng
    {
        if(n==1)
            return 1;
        else
            return n*factorial(n-1);
    }
}