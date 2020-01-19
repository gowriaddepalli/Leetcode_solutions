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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        
        if(root == null){
            return null;
        }
        
       removeTarget(root, target,null);
        
       if(root.left ==null && root.right == null && root.val == target){
           return null;
       }
        
        return root;
        
    }
    
    public void removeTarget(TreeNode root, int target, TreeNode parent){
        if(root == null){
            return;
        }
        
        if(root != null)
        {
            removeTarget(root.left, target, root);
            removeTarget(root.right, target, root);
        }
        
        if(parent !=null && root.left == null && root.right == null && root.val == target){
            if(parent.left == root){
                parent.left = null;
            }
            
            if(parent.right == root){
                parent.right = null;
            }
        }
        
        
    }
}
