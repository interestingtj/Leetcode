class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<t.length();i++)
        {
            char a=t.charAt(i);
            if(map.containsKey(a))
                map.put(a,map.get(a)+1);
            else
                map.put(a,1);
        }
        int count=t.length();
        int l=0,r=0;
        int minl=0,minr=0;
        int min=Integer.MAX_VALUE;
        while(r<s.length())
        {
            char a=s.charAt(r);
            if(map.containsKey(a))
            {
                map.put(a,map.get(a)-1);
                if(map.get(a)>=0)
                    count--;
            }
            while(count==0)
            {

                if(r-l<min)
                {
                    minl=l;
                    minr=r;
                    min=r-l;
                }
                char b=s.charAt(l);
                if(map.containsKey(b))
                {
                    map.put(b,map.get(b)+1);
                    if(map.get(b)>0)
                        count++;
                }
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