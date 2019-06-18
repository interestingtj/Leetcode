class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        if(nums==null||nums.length<3)
            return result;
        int len=nums.length;
        Arrays.sort(nums);
        Map nums2=new HashMap();
        for(int i=0;i<len;i++)
        {
            //if(!nums2.containsKey(nums[i]))
                nums2.put(nums[i],i);
        }

        int a1=0,a2=1;
        while(a1<=len-3&&nums[a1]<=0)
        {
            while(a2<=len-2&&(nums[a1]+nums[a2])<=0)
            {
                int s=-nums[a1]-nums[a2];
                if(nums2.containsKey(s)&&(int)nums2.get(s)>a2)
                {
                    result.add(Arrays.asList(nums[a1],nums[a2],s));
                    //break;
                }
                 
                a2++;
                while(a2<=len-2&&nums[a2]==nums[a2-1])
                    a2++;
            }
            a1++;
            while(a1<=len-3&&nums[a1]==nums[a1-1])
                a1++;
            a2=a1+1;
        }
        
        return result;
    }
}