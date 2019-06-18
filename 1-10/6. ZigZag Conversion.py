class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if(numRows>=len(s) or numRows==1):
            return s
        new=''
        length=len(s)
        
        m=[]
        for i in range(numRows-1):
            m.append(2*numRows-2-2*i)
        m.append(2*numRows-2)
        for i in range(numRows):
            a=i
            new+=s[a]
            while(a<length):
                
                a+=m[i]
                if(a<length):
                    new+=s[a]
                else:
                    break
                a+=m[-i-1]
                if(a<length):
                    new+=s[a]
                else:
                    break
        return new
