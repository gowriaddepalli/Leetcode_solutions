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
    
    
    
    public int maxDepth(TreeNode root) {
        
        if (root == null)
        {
            return 0;
        }
        
        
        int left_subtree = maxDepth(root.left);
        int right_subtree = maxDepth(root.right);
        
        System.out.println("********************");
        System.out.println(left_subtree);
        System.out.println(right_subtree);
        System.out.println("********************");
        
        
        return 1+Math.max(left_subtree, right_subtree);
        
        
        
    }
}
