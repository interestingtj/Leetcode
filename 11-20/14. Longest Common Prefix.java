class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        int n=strs[0].length();
        String common="";
        for(int i=0;i<strs.length;i++)
        {
            if(n>strs[i].length())
                n=strs[i].length();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<strs.length-1;j++)
            {
                if(strs[j].charAt(i)!=strs[j+1].charAt(i))
                    return common;
            }
            common=common+strs[0].substring(i,i+1);
        }
        return common;
    }
}
