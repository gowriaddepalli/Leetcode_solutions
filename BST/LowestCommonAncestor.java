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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        // The trick here is 
        // to search the tree where the p & q lie
        // if they both lie in the right subtree, search the right subtree.
        // if they both lie in the left subtree, search the left subtree.
        // else the root is the LCA.
        
        if(p.val< root.val && q.val< root.val)
        {
            return lowestCommonAncestor(root.left, p, q);
        }else if(p.val> root.val && q.val> root.val)
        {
            return lowestCommonAncestor(root.right, p, q);
        }else
        {
            //System.out.println(root.val);
            return root;
        }
       //return null; 
    }
}
