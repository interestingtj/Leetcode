class Solution {
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        String a="1";
        String output=cou(n,a,1);
        return output;
    }
    private String cou(int n,String a,int init)
    {
        char num=a.charAt(0);
        int count=0;
        StringBuffer output=new StringBuffer();
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)!=num&&count!=0)
            {
                output.append(count).append(num);
                count=1;
                num=a.charAt(i);
            }
            else
                count++;
            if(i==a.length()-1)
                output.append(count).append(num);
        }
        init++;
        if(init!=n)
            return cou(n,output.toString(),init);
        return output.toString();
    }
}