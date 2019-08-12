class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        permuting(result,0,nums);
        return result;
    }
    private void permuting(List<List<Integer>> result,int begin,int[] nums)
    {
        if(begin==nums.length)
        {
            result.add(array2list(nums));
            return;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=begin;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
                continue;
            set.add(nums[i]);
            int temp=nums[begin];
            nums[begin]=nums[i];
            nums[i]=temp;
            permuting(result,begin+1,nums);
            temp=nums[begin];
            nums[begin]=nums[i];
            nums[i]=temp;
        }
    }
    private List<Integer> array2list(int[] nums)
    {
        List<Integer> a=new ArrayList<>();
        for(int i:nums)
            a.add(i);
        return a;
    }
}