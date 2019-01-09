class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null){
            return head;
        }
        
        ListNode head2 = head;
        ListNode head3 = null;
        ListNode head5 = head;
        ListNode head6 = head;
        
        //head2 = head2.next;
        
        while (head2.next != null)
        {
            head5 = head2;
            head2 = head2.next;
            head6 = head3;
            head3 = head5;
            //System.out.println(head5.val);
            //System.out.println(head6.val);
            head5.next = head6;
            //head6.next = null;
            
        }
        //System.out.println(head2.val);
        //System.out.println(head3.val);
        head2.next = head3;
        head = head2;
        
        /*while(head2.next != null)
        {
         System.out.println(head2.val);  
         //System.out.println(head2.next.val); 
         head2 = head2.next;
        }*/
        
        return head;
    }
}
