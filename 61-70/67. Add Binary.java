class Solution {
    public String addBinary(String a, String b) {
        char[] aa=a.toCharArray();
        char[] bb=b.toCharArray();
        int lena=aa.length;
        int lenb=bb.length;
        char[] sum=new char[Math.max(lena,lenb)+1];
        int lens=sum.length;
        int plus=0;
        for(int i=lena-1,j=lenb-1;i>=0||j>=0;i--,j--)
        {
            int aaa=0,bbb=0;
            if(j>=0)
                bbb=bb[j]-'0';
            if(i>=0)
                aaa=aa[i]-'0';
            int s=aaa+bbb+plus;
            if(s<2)
                plus=0;
            else
            {
                s-=2;
                plus=1;
            }
            sum[lens-1]=(char)(s+'0');
            lens--;
        }
        if(plus==0)
            return new String(sum,1,sum.length-1);
        else
            sum[0]='1';
        return new String(sum);
        
    }
}