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
    public boolean isPalindrome(ListNode head) {
        if(head.next!=null)
        {
            ListNode h1=head;
        int l=0;
        while(h1!=null)
        {
            l++;
            h1=h1.next;
        }
        ListNode l1=head;
        ListNode l2=head;
        
        int k=0;
        List<Integer> list1=new ArrayList<Integer>();
        while(k!=l/2-1)
        {
            list1.add(l1.val);
            l1=l1.next;
            l2=l2.next;
            k++;
        }
        if(l%2==0)
        {
            l2=l2.next;
        }
        else
        {
            l2=l2.next;
        }
        l1.next=null;
        
        ListNode curr=l2;
        ListNode prev=null;
        while(curr!=null)
        {
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        List<Integer> list2=new ArrayList<>();
        
        while(head!=null)
        {
            if(head.val!=prev.val)
            {
                return false;
            }
            head=head.next;
            prev=prev.next;
        }
        
        }
        
        
        return true;
    }
}