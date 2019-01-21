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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        /*if(root == null)
        {
            return 0;
        }*/
        
         while(root != null)
        { 
             if(max < (getHieght(root.left) + (getHieght(root.right))))
             {
                max = getHieght(root.left) + (getHieght(root.right));
                 //System.out.println(max);
             }
               diameterOfBinaryTree(root.left);
               diameterOfBinaryTree(root.right);
             return max;
         }
        
        return max;

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


################################# Better Solution ##################################

class Solution {
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        depth(root);
        return ans - 1;
    }
    public int depth(TreeNode node) {
        if (node == null) return 0;
        int L = depth(node.left);
        int R = depth(node.right);
        ans = Math.max(ans, L+R+1);
        return Math.max(L, R) + 1;
    }
}
