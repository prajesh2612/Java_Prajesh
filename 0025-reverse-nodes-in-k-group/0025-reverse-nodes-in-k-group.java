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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode mov=head;
        ListNode stop=head;
        int i;
        while(mov!=null)
        {
            ArrayList<Integer> list=new ArrayList<>();
            for(i=0;i<k;i++)
            {
                if(mov==null)
                {
                    break;
                }
                list.add(mov.val);
                mov=mov.next;
            }
            if(i==k)
            {
                for(i=k-1;i>=0;i--)
                {
                    stop.val=list.get(i);
                    stop=stop.next;
                }
            }
        }
        return head;
        
        
    }
}