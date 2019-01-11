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
    HashSet<Integer> al = new HashSet<Integer>();
    
    public boolean isUnivalTree(TreeNode root) {
        if(root == null)
        {
            return false;
        }
        
        preorderdfs(root);
        
        if(al.size() == 1){
            return true;
        }
      return false;  
    }
    
    public void preorderdfs(TreeNode root)
    {
        if(root != null)
        {
            al.add(root.val);
            preorderdfs(root.left);
            preorderdfs(root.right);
        }
    }
}
