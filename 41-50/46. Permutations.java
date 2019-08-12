class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
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
        for(int i=begin;i<nums.length;i++)
        {
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