class Solution {
    public int maxArea(int[] height) {
        int leng=height.length;
        int max=0;
        int l=0,r=leng-1;
        while(l!=r)
        {
            int area=Math.min(height[l],height[r])*(r-l);
            max=Math.max(max,area);
            if(height[l]<=height[r])
                l++;
            else
                r--;
        }
        
        return max;
    }
}
