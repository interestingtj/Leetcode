/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode len=new ListNode(0);
        len=head;
        int l=0;
        while(len!=null)
        {
            l++;
            len=len.next;
        }
        if(k==1||head==null||k>l)
            return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode a=new ListNode(0);
        ListNode b=new ListNode(0);
        ListNode c=new ListNode(0);
        ListNode start=new ListNode(0);
        ListNode temp=new ListNode(0);
        a=dummy;
        b=head;
        c=dummy;
        start=dummy;
        temp=b;
        while(b!=null&&b.next!=null)    // b a c
        {
            for(int i=k-1;i>0;i--)
            {
                b=temp;
                for(int j=0;j<i-1;j++)
                {
                    if(b==null||b.next==null)
                        break;
                    else
                        b=b.next;
                }
                if(b==null||b.next==null)
                {
                    start.next=c;
                    break;
                }
                a=b.next;
                if(i==k-1)
                {
                    c=a.next;
                    start.next=a;
                }
                a.next=b;
                if(i==1)
                {
                    start=b;
                    temp=c;
                }
            }
        }
        return dummy.next;
    }
}