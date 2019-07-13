class Solution {
    public int longestValidParentheses(String s) {
        int len=s.length();
        int l=0,r=0,out1=0,out2=0,temp=0;
        for(int i=0;i<len;i++)
        {
            if(s.charAt(i)=='(')
            {
                l++;
            }
            if(s.charAt(i)==')')
            {
                r++;
            }
            if(l<r)
            {
                l=0;
                r=0;
                temp=0;
            }
            if(l==r)
            {
                temp=l+r;
                if(temp>out1)
                    out1=temp;
            }

        }
        temp=0;
        l=0;
        r=0;
        for(int i=len-1;i>=0;i--)
        {
            if(s.charAt(i)=='(')
            {
                l++;
            }
            if(s.charAt(i)==')')
            {
                r++;
            }
            if(r<l)
            {
                l=0;
                r=0;
                temp=0;
            }
            if(l==r)
            {
                temp=l+r;
                if(temp>out2)
                    out2=temp;
            }
        }
        if(out1<out2)
            return out2;
        else
            return out1;
    }
}