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
    TreeNode ances = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        traverseTree(root, p,q);
        return ances;
    }
    
    public boolean traverseTree(TreeNode root, TreeNode p, TreeNode q)
    {
        // return false when we reach end of the tree.
        if(root == null)
        {
          return false;    
        }
        
        // Traverse the left subtree to find the element.
        boolean left = traverseTree(root.left, p,q);
        
        // Traverse the right subtree to find the element.
        boolean right = traverseTree(root.right, p,q);
        
        // If the current value is equal root value.
        boolean  curr = (p.val == root.val || q.val == root.val);
        
        // if either 2 flags becomes true that means we have found the current node.
        if((left && right) || (right && curr) || (curr && left))
        {
            ances = root;
        }
        
        
        //if anything is true return;
        return ( left || right || curr);
    }
}
