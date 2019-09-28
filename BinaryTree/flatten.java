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
    public void flatten(TreeNode root) {
       if(root == null) return;
       flatten(root.left);
        flatten(root.right);
        if(root.left !=null){
            TreeNode temp =root.right;
            root.right = root.left;
            root.left = null;
            while(root.right != null){
                root = root.right;
            }
            root.right = temp;
        }
    }
}
