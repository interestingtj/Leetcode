class Solution:
    def twoSum(self, nums, target):
        l=len(nums)
        a1=0
        a2=0
        dic={}
        for i in range(l):
            dic[nums[i]]=i
        for i in range(l):
            b=target-nums[i]
            s=dic.get(b)
            if(s):
                
                if(i==s):
                    continue
                if(i<s):
                    a1=i
                    a2=s
                else:
                    a1=s
                    a2=i
                break
        return a1,a2
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
