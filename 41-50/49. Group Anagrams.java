class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List> res=new HashMap<String,List>();
        for(int i=0;i<strs.length;i++)
        {
            char[] a=strs[i].toCharArray();
            Arrays.sort(a);
            String b=String.valueOf(a);
            if(!res.containsKey(b))
                res.put(b,new ArrayList());
            res.get(b).add(strs[i]);
        }
        return new ArrayList(res.values());
    }
}