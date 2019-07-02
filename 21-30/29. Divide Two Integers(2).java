class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        boolean isSameSign = (dividend <0) == (divisor<0);             
        int res = divideHelper(-Math.abs(dividend),-Math.abs(divisor));    
        //we use negative dividend and divisor to avoid problem for MIN_VALUE     
        return isSameSign ? res : -res;
    }
    
    private int divideHelper(int dividend, int divisor){
        int res = 0;
        int currentDivisor = divisor;
        while(dividend<=divisor){
            int temp = 1;            
            while( (currentDivisor << 1) >=dividend && (currentDivisor << 1) <0 ){
                temp <<=1;
                currentDivisor <<=1;
            }
            dividend -= currentDivisor;
            res += temp;
            currentDivisor = divisor;
        }       
        return res;
    }
}