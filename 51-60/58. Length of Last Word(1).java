class Solution {
    public int lengthOfLastWord(String s) {
        int len=s.length();
        char a;
        int count=0;
        int res=0;
        for(int i=0;i<len;i++)
        {
            a=s.charAt(i);
            if(a==' ')
                count=0;
            else if((a<='z'&&a>='a')||(a<='Z'&&a>='A'))
            {
                count++;
                res=count;
            }
        }
        return res;
    }
}