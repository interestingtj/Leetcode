class Solution {
    public int jump(int[] nums) {
        int len=nums.length;
        int count=0;
        int end=0;
        int max=0;
        for(int i=0;i<len-1;i++)
        {
            max=Math.max(max,nums[i]+i);
            if(i==end)
            {
                end=max;
                count++;
            }
        }
        return count;
    }
}