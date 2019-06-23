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
        ListNode a=new ListNode(0);
        ListNode b=new ListNode(0);
        if(lists.length==0)
            return null;
        a.next=b;
        b.next=lists[0];
        int count=0;
        int c=0;
        int len=lists.length;
        while(count<len)
        {
            int min=99999;
            int con=0;
            for(int i=0;i<lists.length;i++)
            {
                if(lists[i]==null)
                {
                    count++;
                    ListNode[] lists2=new ListNode[lists.length-1];
                    int d=0;
                    for(int j=0;j<lists.length;j++)
                    {
                        if(j!=i)
                        {
                            lists2[d]=lists[j];
                            d++;
                        }
                    }
                    lists=lists2;
                    con=1;
                    break;
                    
                }
                if(lists[i].val<=min)
                {
                    min=lists[i].val;
                    c=i;
                }
            }
            if(con==1)
                continue;
            b.next=lists[c];
            lists[c]=lists[c].next;
            b=b.next;
        }
        return a.next.next;
    }
}