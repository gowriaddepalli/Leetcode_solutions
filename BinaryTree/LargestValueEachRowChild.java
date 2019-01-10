/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        
        if(root == null){ 
            return Collections.emptyList();
        } 
         
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<Integer> al = new ArrayList<Integer>();
        q.add(root); 
        List<Integer> achild = new ArrayList<Integer>();
        while(!q.isEmpty()) 
        { 
            int size = q.size();
             
            // Adding all the child elements of the same level. 
             
            for(int i=0; i<size; i++)
            { 
             TreeNode p = q.poll(); 
            if(p!= null) 
            { 
                achild.add(p.val);
                //List<Node> ch = p.children;
            if(p.left!= null) 
            { 
                  q.add(p.left);  
            } 
                
            if(p.right != null) 
            { 
                  q.add(p.right);  
            }   
            } 
        } 
            if(achild !=null)
            { 
            int max = Collections.max(achild);
            al.add(max);
            //achild.clear(); 
            achild = new ArrayList<Integer>();
 
            } 
                    } 
         
       return al; 
    }
}
