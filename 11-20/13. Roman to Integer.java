class Solution {
    public int romanToInt(String s) {
        int n=0;
        int num=0;
        int l=s.length();
        while(n<l)
        {
            if(s.charAt(n)=='M')
            {
                num=num+1000;
                n++;
            }
            else if(s.charAt(n)=='D')
            {
                num=num+500;
                n++;
            }
            else if(s.charAt(n)=='C')
            {
                if(n<l-1&&s.charAt(n+1)=='M')
                {
                    num=num+900;
                    n=n+2;
                }
                else if(n<l-1&&s.charAt(n+1)=='D')
                {
                    num=num+400;
                    n=n+2;
                }
                else
                {
                    num=num+100;
                    n++;
                }
            }
            else if(s.charAt(n)=='L')
            {
                num=num+50;
                n++;
            }
            else if(s.charAt(n)=='X')
            {
                if(n<l-1&&s.charAt(n+1)=='C')
                {
                    num=num+90;
                    n=n+2;
                }
                else if(n<l-1&&s.charAt(n+1)=='L')
                {
                    num=num+40;
                    n=n+2;
                }
                else
                {
                    num=num+10;
                    n++;
                }
            }
            else if(s.charAt(n)=='V')
            {
                num=num+5;
                n++;
            }
            else if(s.charAt(n)=='I')
            {
                if(n<l-1&&s.charAt(n+1)=='X')
                {
                    num=num+9;
                    n=n+2;
                }
                else if (n<l-1&&s.charAt(n+1)=='V')
                {
                    num=num+4;
                    n=n+2;
                }
                else
                {
                    num++;
                    n++;
                }
            }
        }
        return num;
    }
}
