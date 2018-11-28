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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        dfs(al, root);
        return al;
    }
    
    private void dfs(List<Integer> al, TreeNode root)
    {
        if(root == null){
            return;
        }
        al.add(root.val);
        dfs(al, root.left);
        dfs(al, root.right);
    }
}
