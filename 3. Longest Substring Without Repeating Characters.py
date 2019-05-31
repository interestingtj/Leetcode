class Solution:
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        dic={}
        l=len(s)
        m=0
        n=0
        ma=0
        while(m<l and n<l):
            if(s[n] in dic):
                dic.pop(s[m])
                m+=1
            else:
                dic[s[n]]=0
                n+=1
                ma=max(ma,(n-m))
        return ma
