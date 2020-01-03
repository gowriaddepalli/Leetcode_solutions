/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/
class Solution {
    public Node inorderSuccessor(Node x) {
        
    if(x == null){
        return null;
    }
      
      if(x.right != null){
          Node p = x.right;
          while(p.left!= null){
              p = p.left;
          }
          return p;
      } 
        
     if(x.right == null){
         while(x.parent != null && x == x.parent.right){
             x = x.parent;
         }
         return x.parent;
     }   
        
      return null;  
    }
}
