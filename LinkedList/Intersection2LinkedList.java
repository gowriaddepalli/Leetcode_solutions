/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA== null || headB == null)
        {
            return null;
        }
         
        ListNode headA1 = headA;
        ListNode headB1 = headB;
        ListNode intersection = null;
        int headAlength = 0;
        int headBlength = 0;
        
        while(headA.next != null )
        {
            headA = headA.next;
            headAlength++;
        }
        
        headA = headA1;
        
        while(headB.next != null )
        {
            headB = headB.next;
            headBlength++;
        }
        
        headB = headB1;
        
        if(headAlength> headBlength){
            int diff = headAlength -headBlength;
            while(diff>0)
            {
                headA = headA.next;
                diff--;
            }
        }
        
        if(headAlength< headBlength){
            int diff = headBlength -headAlength;
            while(diff>0)
            {
                headB = headB.next;
                diff--;
            }
        }
        
         if(headA == headB){
            return headA;
        }
        
        while(headA.next != null && headB.next != null)
        {
            if(headA.next == headB.next)
            {
               intersection = headA.next;
               return intersection;
            }
            headA= headA.next;
            headB = headB.next;
        }
        
        return intersection;
    }
}

// https://leetcode.com/problems/intersection-of-two-linked-lists/discuss/49785/Java-solution-without-knowing-the-difference-in-len!
