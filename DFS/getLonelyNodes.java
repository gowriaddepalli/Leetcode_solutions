/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> al = new ArrayList<>();
    
    public List<Integer> getLonelyNodes(TreeNode root) {
        if(root == null)
        {
            return al;
        }
        
        helperFunc(root);
        return al;
    }
    
    void helperFunc(TreeNode root){
        if(root == null){
            return;
        }
        if(root.left != null && root.right == null)
        {
            al.add(root.left.val);
            helperFunc(root.left);
        }
        else if(root.right != null && root.left == null)
        {
            al.add(root.right.val);
            helperFunc(root.right);
        }
        else{
            helperFunc(root.left);
            helperFunc(root.right);
        }
    }
}
