class Solution {
    public boolean isMatch(String s, String p) {
        // If the full string can be matched, then the substring from begining to any point can be matched.
        // And vise versa.
        // Starting from the beginning, we match a substring as long as we can, using the *. => Greedy!
        int ps = 0, pp = 0, newStart = 0, starIdx = -1;            
        while (ps < s.length()){
            // Normal matching.
            if (pp < p.length()  && (p.charAt(pp) == '?' || s.charAt(ps) == p.charAt(pp))){
                ps++;
                pp++;
            } 
            // Wildcard * found. First we use it as Null, then use it to kill the current 1 char in s,
            // then the following 2, 3, ...
            else if (pp < p.length() && p.charAt(pp) == '*'){
                starIdx = pp;
                newStart = ps;
                pp++;
            }
           // Current usage of * failed, so let it kill 1 more char.
            else if (starIdx != -1){
                pp = starIdx + 1;
                newStart++;
                ps = newStart;
            }
           //current pattern pointer is not star, last patter pointer was not *
          //characters do not match
            else return false;
        }
        
        //Finally, the pp should also point to the end.
        while (pp < p.length() && p.charAt(pp) == '*')
            pp++;
        
        return pp == p.length();
    }
}