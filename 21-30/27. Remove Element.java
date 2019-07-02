class Solution {
    public int removeElement(int[] nums, int val) {
        int len=nums.length;
        if(len<1)
            return len;
        int a=0;
        for(int i=0;i<len;i++)
        {
            if(nums[i]!=val)
            {
                nums[a]=nums[i];
                a++;
            }
        }
        return a;
    }
}