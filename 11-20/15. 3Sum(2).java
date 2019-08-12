class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len=nums.length;
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(len<3)
            return res;
        Arrays.sort(nums);
        for(int i=0;i<len-2;i++)
        {
            if(nums[i]>0)
                break;
            if(i>0&&nums[i]==nums[i-1])
                continue;
            int l=i+1,r=len-1;
            while(l<r)
            {
                if(nums[i]+nums[l]+nums[r]==0)
                {
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while(l<r&&nums[l]==nums[l+1])
                        l++;
                    while(l<r&&nums[r]==nums[r-1])
                        r--;
                    l++;
                    r--;
                }
                else if(nums[i]+nums[l]+nums[r]>0)
                    r--;
                else
                    l++;
            }
        }
        return res;
    }
}