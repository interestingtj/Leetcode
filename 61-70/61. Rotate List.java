/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0)
            return head;
        int len=0;
        ListNode start=new ListNode(0);
        start.next=head;
        while(start.next!=null)
        {
            start=start.next;
            len++;
        }
        if(k>=len)
            k=k%len;
        //while(k>=len)
            //k=k-len;
        if(k==0)
            return head;
        ListNode p1=new ListNode(0),p2=new ListNode(0);
        p1.next=head;
        for(int i=0;i<len-k;i++)
            p1=p1.next;
        p2=p1.next;
        p1.next=null;
        start.next=head;
        return p2;
    }
}