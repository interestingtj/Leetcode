/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        ListNode a=new ListNode(0);
        ListNode b=new ListNode(0);
        ListNode c=new ListNode(0);
        ListNode head=new ListNode(0);
        a=l1;
        b=l2;
        head=c;
        while(a!=null&&b!=null)
        {            
            if(a.val<=b.val)
            {
                c.next=a;
                c=c.next;
                a=a.next;
            }
            else
            {
                c.next=b;
                c=c.next;
                b=b.next;
            } 
        }
        while(b!=null)
        {
            c.next=b;
            c=c.next;
            b=b.next;
        }
        while(a!=null)
        {
            c.next=a;
            c=c.next;
            a=a.next;
        }
        return head.next;
    }
}