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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer> st = new HashSet<>();
        List<TreeNode> remaining = new ArrayList<>();
        
        // converting the array to hashset for o(1) access.
        
        for(int i: to_delete){
             st.add(i);
        }
        
        // calling for dfs
        getRemainingNodes(root, st, remaining);
        
        // adding the root element.
        if(!st.contains(root.val))
        {
            remaining.add(root);
        }
        
        return remaining;
    }
    
    
      public TreeNode getRemainingNodes(TreeNode root, Set<Integer> st, List<TreeNode> remaining)
      {
          // return null
          
          if(root == null){
              return null;
          }
          
          // do a dfs to get the left and right nodes.
          
          root.left = getRemainingNodes(root.left, st, remaining);
          root.right = getRemainingNodes(root.right, st, remaining);
          
          // if we are deleting the root and not its children, add the children to the list and return null else return the root.
          if(st.contains(root.val)){
              if(root.left != null){
                  remaining.add(root.left);
              }
              
              if(root.right != null){
                  remaining.add(root.right);
              }
              
              return null;
          }
          
          return root;
      }
}
