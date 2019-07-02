class Solution {
    public int divide(int dividend, int divisor) {
        int result=0;
        if(divisor==1)
            return dividend;
        if (dividend == Integer.MIN_VALUE) 
        {
            if(divisor==Integer.MIN_VALUE)
                return 1;
            if (divisor == -1) 
                return Integer.MAX_VALUE;
        }
        if(divisor==Integer.MIN_VALUE)
            return 0;
        if(dividend>0&&divisor>0)
        {
            while(dividend>=divisor)
            {
                dividend=dividend-divisor;
                result++;
            }
        }
        else if((dividend<0&&divisor<0))
        {
            while(dividend<=divisor)
            {
                dividend=dividend-divisor;
                result++;
            }
        }
        else if((dividend>0&&divisor<0))
        {
            while(dividend>=Math.abs(divisor))
            {
                dividend=dividend+divisor;
                result--;
            }
        }
        else if((dividend<0&&divisor>0))
        {
            if(dividend==Integer.MIN_VALUE)
            {
                dividend+=divisor;
                result--;
            }
            while(Math.abs(dividend)>=divisor)
            {
                dividend=dividend+divisor;
                result--;
            }
        }
        return result;
    }
}