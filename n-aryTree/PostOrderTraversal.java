/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    List<Integer> al = new ArrayList<Integer>();
    
    public List<Integer> postorder(Node root) 
    {
        if(root == null){ 
            return al;
        } 
        postorderDFS(root); 
        return al;
    }
    
    public void postorderDFS(Node root) 
    { 
      if(root != null) 
      { 
          List<Node> child = root.children;
          for(Node c: child) 
          { 
              postorderDFS(c); 
          } 
          al.add(root.val);
      }    
    } 
}
