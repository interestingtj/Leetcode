class Solution {
    public boolean isPalindrome(int x) {
        int rex=0;
        int a=x;
        if(a<0)
            return false;
        while(a>0)
        {
            rex=rex*10+a%10;
            a=a/10;
        }
        return rex==x;
    }
}
