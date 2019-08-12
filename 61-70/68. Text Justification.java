class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res=new ArrayList<String>();
        fj(words,maxWidth,0,res);
        return res;
    }
    private void fj(String[] words,int maxwidth,int start,List<String> res)
    {
        int length=0;
        StringBuffer sb=new StringBuffer();
        int end=start;
        while(end<=words.length-1&&length+words[end].length()+1<=maxwidth+1)
        {
            length=length+words[end].length()+1;   // word+space
            end++;
        }
        length-=1;   //delete last space
        if(end==words.length)  //last line
        {
            for(int i=start;i<end;i++)
            {
                if(i==end-1)   //last word
                {
                    sb.append(words[i]);
                    for(int k=0;k<maxwidth-length;k++)
                        sb.append(" ");
                }
                else
                {
                    sb.append(words[i]);    //word+space
                    sb.append(" ");
                }
            }
            res.add(sb.toString());
            return;
        }
        else if(end-start==1)//one word
        {
            sb.append(words[start]);
            for(int k=0;k<maxwidth-length;k++)
                sb.append(" ");  
            res.add(sb.toString());
            fj(words,maxwidth,end,res);
        }
        else
        {
            int space=maxwidth-length;   
            int extra_space=0;
            while(space%(end-start-1)!=0)
            {
                space--;
                extra_space++;
            }
            int each_space=space/(end-start-1);
            for(int i=start;i<end;i++)
            {
                sb.append(words[i]);    //last word no space
                if(i!=end-1)
                {
                    sb.append(" ");    //word+1 space
                    for(int j=0;j<each_space;j++) //+each space
                        sb.append(" ");
                    if(extra_space>0)  //+extra space
                    {
                        extra_space--;
                        sb.append(" ");
                    }
                }
            }
            res.add(sb.toString());
            fj(words,maxwidth,end,res);
        }
    }
}