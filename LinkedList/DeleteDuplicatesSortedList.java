/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null)
        {
            return head;
        }
        
        ListNode curr = head;
        ListNode prev = null;
        
        while(curr.next != null)
        {
         prev = curr;
         curr = curr.next;
         
         while(curr.val == prev.val)
         {
             prev.next = curr.next;
             curr = prev.next;
            if(curr == null)
            {
            break; 
            }
         }
            if(curr == null)
            {
            break; 
            }
        }
     return head;   
    }
}
