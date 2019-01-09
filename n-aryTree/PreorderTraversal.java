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
    
    public List<Integer> preorder(Node root)
    {
        if(root == null){
            return al;
        }
        preorderDFS(root);
        return al;
    }
    
    
    public void preorderDFS(Node root)
    {
      if(root != null)
      {
          al.add(root.val);
          List<Node> child = root.children;
          for(Node c: child)
          {
              preorderDFS(c);
          }
      }   
    }
}
