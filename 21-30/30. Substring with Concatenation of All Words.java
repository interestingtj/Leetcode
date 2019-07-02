class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        ArrayList<Integer> output=new ArrayList<Integer>();
        if(s.length()==0||words.length==0)
            return output;
        int len1=s.length(); //string length
        int len2=words.length; //array length
        int len3=words[0].length();  //word length
        HashMap<String,Integer> map=new HashMap<>();
        
        for(String w:words)
            map.put(w,map.getOrDefault(w,0)+1);
        for(int i=0;i<=len1-len2*len3;i++)
        {
            if(map.containsKey(s.substring(i,i+len3)))
            {
                HashMap<String,Integer> map2=new HashMap<>(map);
                for(int j=i;j<i+len2*len3;j+=len3)
                {
                    String a=s.substring(j,j+len3);
                    if(map2.containsKey(a))
                    {
                        if(map2.get(a)>0)
                            map2.put(a,map2.get(a)-1);
                        else
                            break;
                    }
                    else
                        break;
                    if(j==i+len2*len3-len3)
                        output.add(i);
                }
            }
        }
        return output;
    }
}