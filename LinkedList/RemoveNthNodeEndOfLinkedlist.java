/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        
        for(int i =0; i<n; i++)
        {
            if(fastPointer == null)
            {
              return head;
            }
            fastPointer = fastPointer.next;
        }
        
        if(fastPointer == null){
            return head.next;
        }
        
        while(fastPointer.next != null)
        {
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }
        
        slowPointer.next= slowPointer.next.next;
        //slowPointer.next.next = null;
        
        return head;
        
    }
}
