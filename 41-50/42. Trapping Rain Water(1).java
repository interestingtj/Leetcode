class Solution {
    public int trap(int[] height) {
        int len=height.length;
        int[] lh=new int[len];
        int[] rh=new int[len];
        int min=0;
        for(int i=0;i<len;i++)
        {
            if(height[i]>min)
                min=height[i];
            lh[i]=min;
        }
        min=0;
        for(int i=len-1;i>=0;i--)
        {
            if(height[i]>min)
                min=height[i];
            rh[i]=min;
        }
        int result=0;
        for(int i=0;i<len;i++)
        {
            result+=Math.min(lh[i],rh[i])-height[i];
        }
        return result;
    }
}