class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())
            return "";
        int len=t.length();
        int[] map=new int[128];
        char[] tc=t.toCharArray();
        char[] sc=s.toCharArray();
        for(int i=0;i<len;i++){
            map[tc[i]]++;
        }
        String res="";
        int min=s.length();
        int p1=0;
        int p2=0;
        while(p2<s.length()){
            if(map[sc[p2]]>0){
                len--;
            }
            map[sc[p2]]--;
            while(len==0&&p1<=p2){
                if(min>=p2-p1+1){
                    res=s.substring(p1,p2+1);
                    min=p2-p1+1;
                }
                map[sc[p1]]++;
                if(map[sc[p1]]>0){
                    len++;
                }
                p1++;
            }
            p2++;
        }
        return res;
    }
}