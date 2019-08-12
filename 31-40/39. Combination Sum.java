class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList result=new ArrayList<>();
        back(candidates,target,result,new ArrayList<Integer>(),0);
        return result;
        
    }
    private void back(int[] cand, int target,List<List<Integer>> result,List<Integer> ans,int start)
    {
        if(target>0)
        {
            for(int i=start;i<cand.length;i++)
            {
                ans.add(cand[i]);
                back(cand,target-cand[i],result,ans,i);
                ans.remove(ans.size()-1);
            }
        }
        if(target==0)
            result.add(new ArrayList<>(ans));
    }
}