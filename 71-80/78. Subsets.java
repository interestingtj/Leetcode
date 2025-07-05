class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        re(nums,0,res,new ArrayList<Integer>());
        return res;
    }
    public void re(int[] nums,int start,List<List<Integer>> res,List<Integer> temp){
        if(start>nums.length-1)
        {
            return;
        }
        for(int i=start;i<nums.length;i++)
        {
            List<Integer> temp2=new ArrayList<>(temp);
            temp2.add(nums[i]);
            res.add(new ArrayList<>(temp2));
            re(nums,i+1,res,temp2);
        }
    }
}