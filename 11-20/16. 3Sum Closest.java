class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int len=nums.length;
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        int result=0;
        for(int i=0;i<len-2;i++)
        {
            int l=i+1,r=len-1;
            while(l<r)
            {
                int s=nums[i]+nums[l]+nums[r]-target;
                if(min>(Math.abs(s)))
                {
                    min=Math.abs(s);
                    result=s+target;
                }
                if(s>0)
                    r--;
                else if(s<0)
                    l++;
                else if(s==0)
                    return result;
                
            }
            
        }
        return result;
    }
}
