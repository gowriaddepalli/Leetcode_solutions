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
        if(head == null){
            return false;
        }
        
        ListNode head2 = head;
        while(head.next!= null)
        {
            head = head.next.next;
            head2 = head2.next;
            
            if(head == head2){
                return true;
            }
            if(head == null){
            return false;
        }
        }
        
        return false;
    }
}
