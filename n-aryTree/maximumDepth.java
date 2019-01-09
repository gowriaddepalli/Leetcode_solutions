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
    public int maxDepth(Node root) {
        if(root == null)
        {
            return 0;
        }
        
        List<Node> ch = root.children;
        
        // get the maximum hieght of all children.
        
        int max = 0;
         for(Node p : ch)
         {
             int hieght = maxDepth(p);
             if(max<hieght)
             {
                max =  hieght;
             } 
         }
        
        return (1+max);
    }
}
