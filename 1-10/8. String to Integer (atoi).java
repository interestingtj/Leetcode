class Solution {
    public int myAtoi(String str) {
        int sign = 1;
        int a=0;
        if(str==null||str.length()==0)
        {
            return 0;
        }
        int l=str.length();
        int c=0;
        while(c<l&&str.charAt(c)==' ')
        {
            c++;
        }
        if(c<l&&str.charAt(c)=='-')
        {
            sign=-1;
            c++;
        }
        else if(c<l&&str.charAt(c)=='+')
        {
            sign=1;
            c++;
        }
        if(c<l&&!Character.isDigit(str.charAt(c)))
            return 0;
        while(c<l&&Character.isDigit(str.charAt(c)))
        {
            if(a>Integer.MAX_VALUE/10||(a==Integer.MAX_VALUE/10 && (int)(str.charAt(c)-'0')>7))
            {
                if(sign==-1)
                    return Integer.MIN_VALUE;
                else
                    return Integer.MAX_VALUE;
            }
            a=10*a+(int)(str.charAt(c)-'0');
            c++;
        }
        return a*sign;
    }
}
