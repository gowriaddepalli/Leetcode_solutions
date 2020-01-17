/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution {
    public Node connect(Node root) {
        if(root == null){
            //root.next = null;
            return root;
        }
    
    Queue<Node> q = new LinkedList<>();
    
    q.add(root);
    
    while(!q.isEmpty()){
        int size = q.size();
        for(int i=0; i<size; i++){
           
            Node item = q.poll();
            
             if(i == size-1){
                item.next = null;
            }else{
                item.next = q.peek();
            }
            
            if(item.left != null){
                    q.add(item.left);
                }
                
                if(item.right != null){
                    q.add(item.right);
                }
        }
    }
        return root;
}
    
}
