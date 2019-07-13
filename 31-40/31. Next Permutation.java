class Solution {
    public void nextPermutation(int[] nums) {
        int len=nums.length;
        if(len<2)
            return;
        int a=0;
        for(int i=len-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                int min=9999;
                int n=len-1;
                for(int j=len-1;j>=i;j--)
                {
                    if(min>nums[j]&&nums[j]>nums[i])
                    {   
                        min=nums[j];
                        n=j;
                    }
                }
                int temp=nums[i];
                nums[i]=nums[n];
                nums[n]=temp;
                a=i+1;
                break;
            }
        }
        int l=a,r=len-1,temp;
        while(l<r)
        {
            temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
        return;
    }
}