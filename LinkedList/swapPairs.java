/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
      
        // create dummy node.
        ListNode dummy = new ListNode(0);
        // point dummy node next to the current head. 
        dummy.next = head;
        // create a pointer referring to the dummy node.
        ListNode point = dummy;
        
        // Iterate through the loop for continuos swapping.
        while(point.next != null && point.next.next != null ){
            
            // keep references and store it.
            
            ListNode one = point.next;
            ListNode two = point.next.next;
            
            // point dummy to the second node.
            point.next = two;
            
            // point the first node to the second node's next.
            one.next = two.next;
            
            // point the second node to the first one.
            two.next = one;
            
            //change the dummy pointer to the previous node.
            point = one;
             
        }
        // return the head.
        return dummy.next;
    }
}
