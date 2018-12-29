/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode l3 = null;
        ListNode l31 = null; // the head  node
        
        if(l1 == null && l2 == null)return null;
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        //placing the head for the new list
        if(l1.val<l2.val)
        {
           l3 = l1; 
           l1 = l1.next;
        }else
        {
           l3 = l2;
            l2=l2.next;
        }
        
        l31 = l3;
        
        while(l1 != null || l2 != null)
        {
            // if any of the list reaches the end first.
            if(l1 == null) {l3.next = l2; break;}
            if(l2 == null) {l3.next = l1; break;}
            if(l1.val<l2.val)
            {
              l3.next = l1;
              l1=l1.next;
              l3 = l3.next;
              
            }else
            {
              l3.next = l2;
              l2=l2.next;
              l3 = l3.next;
 
            }
        }
        return l31;
    }
}
