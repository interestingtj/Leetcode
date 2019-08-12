class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result=new ArrayList<>();
        back(candidates,target,result,new ArrayList<>(),0);
        return result;
    }
    private void back(int[] cand, int target,List<List<Integer>> result,List<Integer> ans,int start)
    {
        if(target>0)
        {
            for(int i=start;i<cand.length;i++)
            {
                if(i>start&&cand[i]==cand[i-1])
                    continue;
                ans.add(cand[i]);
                back(cand,target-cand[i],result,ans,i+1);
                ans.remove(ans.size()-1);
            }
        }
        if(target==0)
            result.add(new ArrayList<>(ans));
    }
}