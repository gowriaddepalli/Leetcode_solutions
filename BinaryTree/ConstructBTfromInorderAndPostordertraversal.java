/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// Steps to construct Binary tree from inorder and postorder traversal.

// 1. As the postorder traversal the root is the last visited, we start from the end of the list and as inording has the root in the center we can recursively construct the left and right part of the tree.

// 2. Find the index of the leftmost element in the inorder tree and we assure we get onnly single number as return as duplicates dont exist.

class Solution {
    
    public int postorderlength = 0;
    
    // General starter code.
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        // Early exit cases.
        if(inorder.length != postorder.length) return null;
        if(inorder.length == 0 || postorder.length == 0) return null;
        
        // Building the tree through helper functions.
        postorderlength = postorder.length -1 ;
        
        TreeNode root = build(inorder, postorder, 0, postorderlength);
        
        return root;     
    }
    
    // Recursive helper code for buildiing the tree.
    public TreeNode build(int[] inorder, int[] postorder, int start, int end)
    {
        // Exit cases.
        if(start>end) return null;
        
        // Construct the node from postorder endmost traversal.
        TreeNode node = new TreeNode(postorder[postorderlength--]);
        
        if(start == end) return node;
        
        // Find the index of the node value to build the left and right recursive trees.
        // right must come before left of the reverse form of postorder traversal.
        int index = findInorderIndex(inorder, node.val,end );
        node.right = build(inorder, postorder, index+1, end);
        node.left = build(inorder, postorder, start, index-1);
        
        return node;
    }
    
    
    
      //  Function to find the element from the inorder tree, the end parameter is only there to reduce th search space.
      public int findInorderIndex(int[] inorder, int target, int end)
      {   int index = 0;
          for(int i= end; i>=0; i--)
          {
              if(inorder[i] == target)
              {
                  index = i;
                  break;
              }
          }
       return index;
      }
    
}
