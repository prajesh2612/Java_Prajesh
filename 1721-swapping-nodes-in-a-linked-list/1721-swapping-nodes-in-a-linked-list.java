/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr=head;
        int l=0;
        while(curr!=null)
        {
            l++;
            curr=curr.next;
        }
        ListNode n1=head;
        int m=1;
        while(m!=k)
        {
            n1=n1.next;
            m++;
        }
        ListNode n2=head;
        while(l!=k)
        {
            n2=n2.next;
            l--;
        }
        int t=n1.val;
        n1.val=n2.val;
        n2.val=t;
        
        return head;
    }
}