class Solution {
    public int removeDuplicates(int[] nums) {
        int len=nums.length;
        if(len<2)
            return len;
        int a=0;
        for(int i=0;i<len-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                a++;
                nums[a]=nums[i+1];
            }
                
        }
        return a+1;
    }
}