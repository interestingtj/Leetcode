class Solution {
    public String minWindow(String s, String t) {
        //HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        int[] map=new int[128];
        char[] ss=s.toCharArray();
        char[] tt=t.toCharArray();
        for(char i:tt)
            map[i]++;
        int count=t.length();
        int l=0,r=0;
        int minl=0,minr=0;
        int min=Integer.MAX_VALUE;
        while(r<s.length())
        {
            map[ss[r]]--;
            if(map[ss[r]]>=0)
                count--;
            while(count==0)
            {
                if(r-l<min)
                {
                    minl=l;
                    minr=r;
                    min=r-l;
                }
                map[ss[l]]++;
                if(map[ss[l]]>0)
                    count++;
                l++;
            }
            r++;
        }
        if(min==Integer.MAX_VALUE)
            return "";
        else
            return s.substring(minl,minr+1);
    }
}