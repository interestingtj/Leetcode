class Solution {
    public int trap(int[] height) {
        int len=height.length;
        int l=0,r=len-1,lmax=0,rmax=0,result=0;
        while(l<r)
        {
            if(height[l]<height[r])
            {
                if(height[l]>=lmax)
                    lmax=height[l];
                else
                    result+=lmax-height[l];
                l++;
            }
            else
            {
                if(height[r]>=rmax)
                    rmax=height[r];
                else
                    result+=rmax-height[r];
                r--;
            }
        }
        return result;
    }
}