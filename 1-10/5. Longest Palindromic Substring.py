class Solution:
    def longestPalindrome(self, s: 'str') -> 'str':
        length=len(s)
        start=0
        end=0
        maxx=0
        for i in range(length):
            a=i
            b=i
            while(a>=0 and b<=length-1):
                if((b-a)>maxx and s[a]==s[b]):
                    maxx=b-a
                    start=a
                    end=b
                elif(s[a]!=s[b]):
                    break
                a-=1
                b+=1
                
            c=i
            d=i+1
            while(c>=0 and d<=length-1):
                if((d-c)>maxx and s[c]==s[d]):
                    maxx=d-c
                    start=c
                    end=d
                elif(s[c]!=s[d]):
                    break
                c-=1
                d+=1
        return s[start:end+1]
