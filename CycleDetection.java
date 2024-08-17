/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;

        ListNode n = head.next;

        while(head!=null && n!=null && n.next!=null)
        {
            head=head.next;
            n = n.next.next;

            if(head==n)  return true;

        }

        return false;
    
    }
}
