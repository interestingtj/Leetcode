class Solution {
    public int searchInsert(int[] nums, int target) {
        int len=nums.length;
        int l=0,r=len-1;
        int mid=0;
        while(l<r)
        {
            mid=(l+r)/2;
            if(nums[mid]<target)
                l=mid+1;
            else if(nums[mid]>target)
                r=mid;
            else if(nums[mid]==target)
                return mid;
            
        }
        if(nums[l]<target)
            return l+1;
        else
            return l;
    }
}