class Solution {
    public List<String> letterCombinations(String digits) {
        String[][] n={{""},{""},{"a","b","c"},{"d","e","f"},{"g","h","i"},{"j","k","l"},{"m","n","o"},{"p","q","r","s"},{"t","u","v"},{"w","x","y","z"}};
        
        List<String> result=new ArrayList();
        if(digits==null||digits.length()==0)
            return result;
        result.add("");
        int len=digits.length();
        for(int i=0;i<len;i++)
        {
            result=output(n,(int)(digits.charAt(i)-'0'),result);
        }
        return result;
    }
    public List<String> output(String[][] n,int a,List<String> output){
        List<String> www=new ArrayList();
        for(String j:output)
            for(String i:n[a])
                www.add(j+i);
        
        return www;
        
    }
}