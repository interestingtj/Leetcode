class Solution {
    public int mySqrt(int x) {
        int min=1,max=x;
        int mid;
        int div,res=0;
        while(min<=max)
        {
            mid=(min+max)/2;
            div=x/mid;
            if(div==mid)
                return div;
            else if(div>mid)
            {
                min=mid+1;
                res=mid;
            }
            else
                max=mid-1;
        }
        return res;

    }
}