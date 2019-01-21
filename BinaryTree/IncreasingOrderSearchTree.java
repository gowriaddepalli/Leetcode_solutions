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
    
    ArrayList<Integer> io = new ArrayList<Integer>();
    
    public TreeNode increasingBST(TreeNode root) {
        if(root == null)
        {
            return null;
        }
        
        inorderTraversal(root);
        
        TreeNode rootw = new TreeNode(io.get(0));
        TreeNode root1 = rootw;
        
        for(int i=1; i<io.size(); i++){
            
            while(root1.right != null){
                root1 = root1.right;
            }
            TreeNode n = new TreeNode(io.get(i));
            root1.right = n;
        }
        
        return rootw;
    }
    
    
    public void inorderTraversal(TreeNode root) 
    {
        if(root != null)
        {
            inorderTraversal(root.left);
            io.add(root.val);
            inorderTraversal(root.right);
        }
    }
}
