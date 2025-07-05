class Solution {
    public int removeDuplicates(int[] nums) {
        int p1=0;
        int count=0;
        int a=-999;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=a)
            {
                count=1;
                a=nums[i];
            }
            else
                count++;
            if(count<=2)
            {
                nums[p1]=a;
                p1++;
            }
        }
        return p1;
    }
}