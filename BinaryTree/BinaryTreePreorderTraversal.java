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
    
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null)
        {
            return al;
        }
        postorderDFS(root);
        return al;
    }
    
    public void postorderDFS(TreeNode root)
    {
        if(root  != null)
        {
           al.add(root.val);
           postorderDFS(root.left);
           postorderDFS(root.right);
        } 
    }
}
