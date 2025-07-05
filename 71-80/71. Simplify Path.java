class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack=new Stack<String>();
        int len=path.length();
        String res="";
        for(int i=0;i<len;i++)
        {
            String temp="";
            while(i<len&&path.charAt(i)=='/')
                i++;
            while(i<len&&path.charAt(i)!='/')
            {
                temp+=path.charAt(i);
                i++;
            }
            if(temp.equals("")||temp.equals("."))
                continue;
            else if(temp.equals("..")&&!stack.isEmpty())
                stack.pop();
            else if(!temp.equals(".."))
                stack.push(temp);
        }
        if(stack.isEmpty())
            return "/";
        while(!stack.isEmpty())
        {
            res="/"+stack.pop()+res;
        }
        return res;
    }
}