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
    
    TreeNode parent;

    public boolean isValidBST(TreeNode root) {
        
        boolean validbst = true;
        
        if(root == null){
            return true;
        }
        boolean left = isValidBST(root.left);
        
        if(parent!= null)
        {
            validbst = root.val > parent.val;
        }
       
        
        parent = root;
     
        if(left && isValidBST(root.right) && validbst)
        {
            return true;
        }
        
        return false;
    }
}
