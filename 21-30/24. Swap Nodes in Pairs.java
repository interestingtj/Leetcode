/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode a=new ListNode(0);
        a=head;
        ListNode b=new ListNode(0);
        b=head.next;
        ListNode c=new ListNode(0);
        ListNode result=new ListNode(0);
        result.next=c;
        while(b!=null)
        {
            c.next=b;
            a.next=b.next;
            b.next=a;
            if(a!=null&&a.next!=null)
            {
                c=a;
                a=a.next;
                b=a.next;
            }
            else
                break;
        }
        return result.next.next;
    }
}