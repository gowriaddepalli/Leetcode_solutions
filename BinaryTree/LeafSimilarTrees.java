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
    ArrayList<Integer> al1 = new ArrayList<Integer>();
    ArrayList<Integer> al2 = new ArrayList<Integer>();
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        if(root1 == null && root2 == null)
        {
            return true;
        }
        
        if(root1 == null || root2 == null)
        {
            return false;
        }
        
        postorderTraversal(root1,al1);
        postorderTraversal(root2,al2);
        
        if(al1.equals(al2))
        {
            return true;
        }
        return false;
    }
    
    
    public void postorderTraversal(TreeNode root, ArrayList<Integer> al)
    
    {
                  
              if(root !=null)
              {
              postorderTraversal(root.left, al);
              postorderTraversal(root.right, al);
              if(root.left == null && root.right ==null){
                  al.add(root.val);
              }
              }
    }
}
