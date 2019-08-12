class Solution {
    public boolean canJump(int[] nums) {
        int len=nums.length;
        int max=0;
        for(int i=0;i<len-1;i++)
        {
            if(max>=i)
                max=Math.max(max,i+nums[i]);
        }   
        if(max>=len-1)
            return true;
        else 
            return false;
    }
}