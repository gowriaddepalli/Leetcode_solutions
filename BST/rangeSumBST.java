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
    int sum =0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null){
            return 0;
        }
        
        traverse(root, L, R);
        
        return sum;
    }
    
    
    public void traverse(TreeNode root, int L, int R){
        if(root == null){
            return;
        }
        if(root.val>= L && root.val <= R){
            sum += root.val;
        }
        
        traverse(root.left, L,R);
        traverse(root.right, L, R);
        
    }
}
