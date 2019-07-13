class Solution {
    public int search(int[] nums, int target) {
        int len=nums.length;
        if(len==0)
            return -1;
        if(len==1)
        {
            if(nums[0]==target)
                return 0;
        }
        int head=0,tail=len-1,mid=(head+tail)/2;
        while(head<tail)
        {
            
            if(nums[mid]==target)
                return mid;
            if(nums[mid]<nums[head])
            {
                if(target<nums[mid]||target>=nums[head])
                    tail=mid;
                else
                    head=mid;
            }
            else if(nums[mid]>nums[head])
            {
                if(target<nums[mid]&&target>=nums[head])
                    tail=mid;
                else
                    head=mid;
            }
            mid=(head+tail)/2;
            if(head==mid)
            {
                if(nums[mid]==target)
                    return mid;
                else if(nums[tail]==target)
                    return tail;
                else
                    break;
            }
        }
        return -1;
    }
}