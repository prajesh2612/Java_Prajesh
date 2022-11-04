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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)
        {
            return head.next;
        }
        ListNode curr=head;
        int l=0;
        while(curr!=null)
        {
            l++;
            curr=curr.next;
        }
        if(n==l)
        {
            head=head.next;
            return head;
        }
        ListNode curr2=head;
        ListNode prev=curr2;
        while(curr2!=null)
        {
            if(l==n)
            {
                break;
            }
            l--;
            prev=curr2;
            curr2=curr2.next;
        }
        curr2=curr2.next;
        prev.next=curr2;
        
        
        return head;
        
    }
}