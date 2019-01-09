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
    public List<List<Integer>> levelOrder(Node root) {
        
        if(root == null){
            return Collections.emptyList();
        }
        
        Queue<Node> q = new LinkedList<Node>();
        List<List<Integer>> al = new ArrayList<List<Integer>>();
        q.add(root);
        List<Integer> achild = new ArrayList<Integer>();
        while(!q.isEmpty())
        {
            int size = q.size();
            
            // Adding all the child elements of the same level.
            
            for(int i=0; i<size; i++)
            {
             Node p = q.poll();
            if(p!= null)
            {
                achild.add(p.val);
                List<Node> ch = p.children;
            if(ch!= null)
            {
              for(Node n: ch)
              
              {
                  q.add(n);
              }  
            }
            }
        }
            if(achild !=null)
            {
            al.add(achild);
            //achild.clear();
            achild = new ArrayList<Integer>();

            }
                    }
        
       return al; 
    }
}
