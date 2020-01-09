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
    List<List<Integer>> al = new ArrayList<>();
    public List<List<Integer>> findLeaves(TreeNode root) {
        if(root == null){
            return al;
        }
        
        while(root.left!= null || root.right != null){
            al.add(getLeaves(root));
            //System.out.println("***");
        }
        
          List<Integer> leaves = new ArrayList<>();
          leaves.add(root.val);
          al.add(leaves);
        return al;
    }
    
    
    public List<Integer> getLeaves(TreeNode root){
        
        List<Integer> leaves = new ArrayList<>();
        traverse(root, leaves, null);
        return leaves;
           
    }
    
    public void traverse(TreeNode root, List<Integer>leaves, TreeNode parent){
        if(root == null){
            return;
        }
        
        if(root.left == null && root.right == null)
        {
            leaves.add(root.val);
            //System.out.println(root.val);
            if(parent != null && parent.left == root){
                parent.left = null;
            }else if(parent != null && parent.right == root){
                parent.right = null;
            }
        }
        if(root != null){
        traverse(root.left, leaves, root);
        traverse(root.right, leaves, root);
        }
        
    }
    
    
    
}
