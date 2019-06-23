/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ex=new ListNode(0);
        ex.next=head;
        ListNode a=ex;
        int len=0;
        while(a!=null)
        {
            len++;
            a=a.next;
        }
        len=len-n-1;
        a=ex;
        for(int i=0;i<len;i++)
            a=a.next;
        a.next=a.next.next;
        return ex.next;
        
    }
}