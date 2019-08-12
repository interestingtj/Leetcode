class Solution {
    public int lengthOfLastWord(String s) {
        int len=s.length();
        char a;
        int count=0;
        int n=len-1;
        while(n>=0&&s.charAt(n)==' ')
            n--;
        while(n>=0&&s.charAt(n)!=' ')
        {
            count++;
            n--;
        }
        return count;
    }
}