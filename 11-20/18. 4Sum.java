class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result=new ArrayList();
        if(nums==null||nums.length<4)
            return result;
        Arrays.sort(nums);
        int len=nums.length;
        for(int i=0;i<len-3;i++)
        {
            if(i>0&&nums[i]==nums[i-1])
                continue;
            if(nums[i]+3*nums[len-1]<target)
                continue;
            if(nums[i]*4>target)
                break;
            for(int j=i+1;j<len-2;j++)
            {
                if(j>i+1&&nums[j]==nums[j-1])
                    continue;
                if(nums[j]+nums[i]+2*nums[len-1]<target)
                    continue;
                if(nums[i]+nums[j]*3>target)
                    break;
                int l=j+1,r=len-1;
                while(l<r)
                {
                    int sum=nums[i]+nums[j]+nums[l]+nums[r];
                    if(sum==target)
                    {
                        if(l==j+1||nums[l]!=nums[l-1])
                        {
                            result.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                            l++;
                            r--;
                        }
                        else
                        {
                            l++;
                            r++;
                        }
                    }
                    else if(sum<target)
                        l++;
                    else if(sum>target)
                        r--;
                }
            }
        }
        return result;
    }
}