class Solution {
    public double myPow(double x, int n) {
        if(n==0)
        {
            if(x==0)
                return 0;
            else 
                return 1;
        }
        if(n==Integer.MIN_VALUE)
            return myPow(x*x,n/2);
        if(n<0)
        {
            x=1/x;
            n=-n;
        }
        double result=1;
        while(n>0)
        {
            if((n&1)==1)
                result=result*x;
            x*=x;
            n>>=1;
        }
        return result;
    }
}