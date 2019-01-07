/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
 // Create two pointers, one that moves two step ahead, and one that moves one step ahead.
class Solution {
    
    public ListNode middleNode(ListNode head) {
        ListNode head2 = head;
        if(head == null){
            return null;
        }
      while(head.next != null){
          head = head.next.next;
          head2= head2.next;
          if(head == null){
              return head2;
          }
      } 
        return head2;
    }
}
