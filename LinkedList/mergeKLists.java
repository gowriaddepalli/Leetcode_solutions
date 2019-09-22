/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
       
     int last = lists.length - 1;
     
        if(last < 0){
            return null;
        }
       
        while(last != 0){
            int i = 0;
            int j = last;
            while(i<j){
               lists[i]=merge(lists[i],lists[j]);
                i++;
                j--;
                if(i >= j){
                    last = j;
                }
            }
        }
       
        return lists[0];
    }
   
    public ListNode merge(ListNode l1, ListNode l2){
       
        ListNode result = null;
       
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
       
        if(l1.val < l2.val){
            result = l1;
            result.next = merge(l1.next,l2);
        }else{
            result = l2;
            result.next = merge(l1,l2.next);
        }
       
        return result;
    }
}
