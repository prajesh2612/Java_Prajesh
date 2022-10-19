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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if((head.next!=null)&&(left!=right))
        {
            ListNode currL=head;
            ListNode currR=head;
            
            ListNode prev=null;
            
            int l=1,r=1;
             while(currL!=null)
             {
                 if(l==left)
                 {
                     break;
                 }
                 prev=currL;
                 currL=currL.next;
                 currR=currR.next;
                 l++;
                 r++;
             }
            while(currR!=null)
            {
                if(r==right)
                {
                    break;
                }
                currR=currR.next;
                r++;
            }
            ListNode nxt=currR.next;
            
            
            if(prev==null)
            {
                prev=currL;
                head=currR;
            }
            
             
             ListNode curr2=currL.next;
             ListNode prev2=currL;
            
            prev.next=currR;
            currL.next=nxt;
            
            
            while(curr2!=nxt)
            {
                ListNode temp=curr2.next;
                curr2.next=prev2;
                prev2=curr2;
                curr2=temp;
            }
                       
        }
        return head;        
    }
}