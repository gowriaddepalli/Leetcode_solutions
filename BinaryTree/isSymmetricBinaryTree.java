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
    public boolean isSymmetric(TreeNode root) {
        
        if(root == null)
        {
            return true;
        }
        
        boolean val  = isMirror(root.left, root.right);

        return val;
    }
    
    
    public boolean isMirror(TreeNode left, TreeNode right)
    {
        if(left == null && right == null)
        {
            return true;
        }
        
        if(left == null || right == null)
        {
            return false;
        }
        
        return (left.val == right.val) && isMirror(left.left,right.right) && isMirror(left.right, right.left);
    }
}
