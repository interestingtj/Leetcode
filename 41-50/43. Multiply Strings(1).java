class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0"))
            return "0";
        int n1=0,n2=0,n=0;
        String result="0";
        int count=0;
        for(int i=num1.length()-1;i>=0;i--)
        {
            n1=num1.charAt(i)-'0';
            StringBuffer temp=new StringBuffer();
            n=0;
            for(int j=num2.length()-1;j>=0;j--)
            {
                
                n2=num2.charAt(j)-'0';
                int sum=n1*n2+n;
                n=sum/10;
                temp.append(String.valueOf(sum%10));
                
            }
            if(n>0)
                temp.append(String.valueOf(n));
            temp=temp.reverse();
            for(int w=0;w<count;w++)
                temp.append("0");
            result=addd(result,temp.toString());
            count++;
        }
        return result;
        
    }
    private String addd(String a,String b)
    {
        int n1=a.length()-1;
        int n2=b.length()-1;
        StringBuffer result=new StringBuffer();
        int jw=0;
        int aa=0,bb=0;
        while(n1>=0||n2>=0)
        {
            if(n1>=0)
                aa=a.charAt(n1)-'0';
            else
                aa=0;
            if(n2>=0)
                bb=b.charAt(n2)-'0';
            else
                bb=0;
            int sum=aa+bb+jw;
            jw=sum/10;
            result.append(String.valueOf(sum%10));
            n1--;
            n2--;
        }
        if(jw>0)
            result.append(String.valueOf(jw));
        return result.reverse().toString();
    }
}