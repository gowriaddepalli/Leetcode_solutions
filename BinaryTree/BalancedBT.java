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
    public boolean isBalanced(TreeNode root) {
        //System.out.println(getHieght(root));
        
        while(root != null)
        {
            if(Math.abs(getHieght(root.left) - (getHieght(root.right))) >1){
                return false;
            }else
            {
               return (isBalanced(root.left) && isBalanced(root.right));
            }
        }
        
        return true;
    }
    
    public int getHieght(TreeNode root)
    {
         if(root == null)
         {
             return 0;
         }else
         {
             return 1+ Math.max(getHieght(root.left),getHieght(root.right));
         }
    }
}
