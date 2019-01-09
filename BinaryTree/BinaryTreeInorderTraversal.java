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
    
    List<Integer> al = new ArrayList<Integer>();
    
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        if(root == null)
        {
            return al;
        }
        
        inorderDFS(root);
        return al;
    }
    
    public void inorderDFS(TreeNode root)
    {
        if(root != null)
        {
           inorderDFS(root.left);
           al.add(root.val);
           inorderDFS(root.right);
        }
    }
}
