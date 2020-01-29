/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;
        
        int sum  = 0;
        int carry = 0;
        
        ListNode result = new ListNode(-1);
        ListNode temp = result;
        
        while(head1 != null && head2 != null){
            sum = (head1.val + head2.val + carry)%10;
            carry = (head1.val + head2.val + carry)/10;
            ListNode l = new ListNode(sum);
            temp.next = l;
            temp = temp.next;
            head1 = head1.next;
            head2 = head2.next;
        }
        
        while(head1 != null){
           sum = (head1.val  + carry)%10;
           carry = (head1.val  + carry)/10;
           ListNode l = new ListNode(sum); 
           temp.next = l;
           temp = temp.next;
           head1 = head1.next;
        }
        
        while(head2 != null){
            sum = (head2.val  + carry)%10;
           carry = (head2.val  + carry)/10;
           ListNode l = new ListNode(sum); 
           temp.next = l;
           temp = temp.next;
           head2 = head2.next;
        }
        
        if(carry != 0){
           ListNode l = new ListNode(carry); 
           temp.next = l;
           temp = temp.next; 
        }
        return result.next;
        
    }
}
