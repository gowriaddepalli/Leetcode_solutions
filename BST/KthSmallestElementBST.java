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
    ArrayList<Integer> inordertraversalList = new  ArrayList<Integer>();
    
    public int kthSmallest(TreeNode root, int k) {
        if(root == null){
            return -1;
        }
        
        inordertraversal(root);
        return inordertraversalList.get(k-1);
    }
    
    public void inordertraversal(TreeNode root)
    {
        if(root != null)
        {
            inordertraversal(root.left);
            inordertraversalList.add(root.val);
            inordertraversal(root.right);
        }
    }
}
