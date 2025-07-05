class Solution {
    public void sortColors(int[] nums) {
        int p0=-1,p1=-1,p2=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                p2++;
                nums[p2]=2;
                p1++;
                nums[p1]=1;
                p0++;
                nums[p0]=0;
            }
            else if(nums[i]==1)
            {
                p2++;
                nums[p2]=2;
                p1++;
                nums[p1]=1;
            }
            else
            {
                p2++;
                nums[p2]=2;
            }
        }
    }
}