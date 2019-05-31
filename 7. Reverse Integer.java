class Solution {
    public int reverse(int x) {
        String y=Math.abs(x)+"";
        
        int[] a=new int[y.length()-1];
        
        for(int i=0;x<=-10||x>=10;i++)
        {
            a[i]=x%10;
            x=x/10;
        }
        long b=0;
        for(int i=0;i<(y.length()-1);i++)
        {
            b=10*b+a[i];
        }
        b=10*b+x;
        if(b<Integer.MIN_VALUE||b>Integer.MAX_VALUE)
        {
            return 0;
        }
        else
        {
           return (int)b; 
        }
    }
}