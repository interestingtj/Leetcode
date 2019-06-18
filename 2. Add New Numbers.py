# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        ans=[]
        ten=0
        while(l1 or l2):
            if(l1==None):
                a=l2.val+ten
                ten=0
                l2=l2.next
            elif(l2==None):
                a=l1.val+ten
                ten=0
                l1=l1.next
            else:
                a=l1.val+l2.val+ten
                ten=0
                l1=l1.next
                l2=l2.next
            if(a>=10):
                ans.append(a-10)
                ten=1
            else:
                ans.append(a)      
        if ten!=0:
            ans.append(ten)
        return ans
