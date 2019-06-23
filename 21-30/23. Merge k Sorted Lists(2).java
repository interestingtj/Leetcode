/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            public int compare(ListNode l1, ListNode l2) {
                return l1.val - l2.val;}
        });  
        //PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>((l1,l2)-> l1.val - l2.val);
        ListNode a=new ListNode(0);
        ListNode b=new ListNode(0);
        a=b;
        for(ListNode i:lists)
        {
            if(i==null)
                continue;
            queue.add(i);
        }
        while(!queue.isEmpty())
        {
            b.next=queue.remove();
            if(b.next.next!=null)
                queue.add(b.next.next);
            b=b.next;
        }
        return a.next;                                                  
    }
}