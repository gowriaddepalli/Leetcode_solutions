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
    
    
    public List<List<Integer>> levelOrder(TreeNode root) {
    
        List<List<Integer>> al = new ArrayList<List<Integer>>();
        ArrayList<Integer> ad = new ArrayList<Integer>();
        
        Queue<TreeNode> qu = new LinkedList<TreeNode>();
        
        if(root !=null)
        {
          qu.add(root);
        }
                
        while(!qu.isEmpty())
        {
            int size = qu.size();
            //System.out.println(size);
            // Iterate for the number of children per level and then add to the list.
            for(int i=0; i<size;i++)
            {
            TreeNode t = qu.peek();
            ad.add(t.val); 
            List<TreeNode> qchild = getChildren(t);
            if(qchild !=null)
            {
                for(TreeNode u: qchild)
                {
                if(u != null)
                {
                   qu.add(u);
                }
                }
                
            } 
            qu.poll();
            }
            //System.out.println(ad.size());
            al.add(ad);
            ad = new ArrayList<Integer>();
            
        }
        
        return al;
    }
    
    
    public List<TreeNode> getChildren(TreeNode root) {
        List<TreeNode> alchild1 = new ArrayList<TreeNode>();
        if(root.left == null && root.right == null){
            return null;
        }
        if(root.left != null)
        {
           alchild1.add(root.left); 
        }
        if(root.right != null)
        {
           alchild1.add(root.right); 
        }
        
        
        return alchild1;
    }
}
