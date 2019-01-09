/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        
        return reverse(null, head);
    }
    
    public ListNode reverse(ListNode prev, ListNode curr)
    {
        if(curr == null)
        {
            return prev;
        }
            ListNode p = reverse(curr, curr.next);
            curr.next = prev;
        return p;
    }
}
