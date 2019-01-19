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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        
        if(t1==null && t2 == null)
        {
            return null;
        }else if(t1 ==null)
        {
            t1= t2;
            return t1;
        }else if(t2 ==null)
        {
            t2= t1;
            return t2;
        }else{
           t1.val = t1.val+ t2.val; 
        }
        
        
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        
        return t1;
    }
}
