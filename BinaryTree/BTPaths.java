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
    List<String> btp = new ArrayList<String>();
    
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null)
        {
            return btp;
        }
        
        preorderdfs(root, "");
        
        return btp;
    }
    
    public List<String> preorderdfs(TreeNode root, String path)
    {
          if(root == null)
        {
            return btp;
        }
        
        if(root.left == null && root.right == null)
        {
            btp.add(path+root.val);
        }
        
        preorderdfs(root.left, path+root.val+"->");
        preorderdfs(root.right, path+root.val+"->");
        
        
        return btp;
    }
}
