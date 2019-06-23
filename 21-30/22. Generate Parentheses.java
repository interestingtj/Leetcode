class Solution {
    public List<String> generateParenthesis(int n) {
        
        int a=0,b=0;
        List<String> result=new ArrayList();
        if(n<1)
            return result;
        recursive(a,b,"",result,n);
        return result;
    }
    public void recursive(int a,int b,String temp,List<String> result,int n)
    {
        if(a==n&&b==n)
        {
            result.add(temp);
            return;
        }
        if(b>a)
            return;
        if(a>n||b>n)
            return;
        String temp2=temp+"(";
        recursive(a+1,b,temp2,result,n);
        temp2=temp+")";
        recursive(a,b+1,temp2,result,n);
    }
}