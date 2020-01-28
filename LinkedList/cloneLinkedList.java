/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    
    private HashMap<Node, Node> visited = new HashMap<>();
    
    public Node copyRandomList(Node head) {
        if(head == null){
            return head;
        }
        
        
       if(visited.containsKey(head)){
           return visited.get(head);
       }
        
        
       Node clone = new Node(head.val,null,null);
       visited.put(head, clone);
        
        clone.next = copyRandomList(head.next);
        clone.random = copyRandomList(head.random);
        
        return clone;
        
    }
}
