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
    
    public String tree2str(TreeNode t) {
        // when reach leaf node.  
        if(t== null)
        {
           return ""; 
        }
        
        // Doing a preorder traversal.
        
        String res = t.val + "";

              
        String lBS = tree2str(t.left);
        String rBS = tree2str(t.right);
        
        // If both children are null.
        if(lBS == "" && rBS == "")
        {
           return res;
        }
        
        // If the right child is null.
        if(rBS== "")
        {
           return  res+"("+lBS+")";
        }
        
        // if the left child is null.
        if(lBS == "")
        {
         return  res+"()"+"("+rBS+")";   
        }
      
      //This is the pattern of how the design is wanted.  
      String FinalString = res+"("+lBS+")"+"("+rBS+")";
      return FinalString;  
    }
    
}
