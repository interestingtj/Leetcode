class Solution {
    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) 
            return s.isEmpty();
        boolean match=!s.isEmpty()&&(p.charAt(0)==s.charAt(0)||p.charAt(0)=='.');
        if(p.length()>1&&p.charAt(1)=='*')
        {
            return (isMatch(s,p.substring(2))||(match&&isMatch(s.substring(1),p)));
        }
        else
        {
            return match&&isMatch(s.substring(1),p.substring(1));
        }
    }
}
