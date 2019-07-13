class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] output={-1,-1};
        int len=nums.length;
        if(len==0)
            return output;
        if(len==1)
        {
            if(nums[0]==target)
            {
                output[0]=0;
                output[1]=0;
            }
            return output;
        }
        int l=0,r=len-1;
        int mid=(l+r)/2;
        while(l<r)
        {
            if(nums[mid]<target)
                l=mid+1;
            else
                r=mid;
            mid=(l+r)/2;
            
        }
        if(nums[l]!=target||l==len)
            return output;
        output[0]=l;
        l=0;
        r=len-1;
        mid=(l+r)/2;
        while(l<r)
        {
            if(nums[mid]<=target)
                l=mid+1;
            else
                r=mid;
            mid=(l+r)/2;
        }
        if(nums[l]==target)
            output[1]=l;
        else
            output[1]=l-1;
        return output;
    }
}