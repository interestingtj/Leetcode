class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals(""))
            return 0;
        if(haystack.equals(""))
            return -1;
        int len=needle.length();
        int len2=haystack.length();
        for(int i=0;i<len2-len+1;i++)
        {
            if(haystack.charAt(i)==needle.charAt(0))
                if(haystack.substring(i,i+len).equals(needle))
                {
                    return i;
                }
        }
        return -1;
    }
}