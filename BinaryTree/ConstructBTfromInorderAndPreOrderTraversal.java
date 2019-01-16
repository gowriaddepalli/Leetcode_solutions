/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// Steps to construct Binary tree from inorder and preorder traversal.

// 1. As the preorder traversal the root is the first visited, we start from the start of the list and as inording has the root in the center we can recursively construct the left and right part of the tree.

// 2. Find the index of the leftmost element in the inorder tree and we assure we get onnly single number as return as duplicates dont exist.

class Solution {
    
    public int preorderlength = 0;
    
    // General starter code.
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        // Early exit cases.
        if(inorder.length != preorder.length) return null;
        if(inorder.length == 0 || preorder.length == 0) return null;
        
        // Building the tree through helper functions.
        preorderlength = 0;
        
        TreeNode root = build(inorder, preorder, preorderlength, preorder.length-1);
        
        return root;     
    }
    
    // Recursive helper code for building the tree.
    public TreeNode build(int[] inorder, int[] preorder, int start, int end)
    {
        // Exit cases.
        if(start>end) return null;
        
        // Construct the node from preorder firstmost traversal.
        TreeNode node = new TreeNode(preorder[preorderlength++]);
        
        if(start == end) return node;
        
        // Find the index of the node value to build the left and right recursive trees.
        // left must come before right of the reverse form of preorder traversal.
        int index = findInorderIndex(inorder, node.val,start );
        node.left = build(inorder, preorder, start, index-1);
        node.right = build(inorder, preorder, index+1, end);
        
        return node;
    }
    
    
    
      //  Function to find the element from the inorder tree, the start parameter is only there to reduce th search space.
      public int findInorderIndex(int[] inorder, int target, int start)
      {   int index = 0;
          for(int i= start; i<inorder.length; i++)
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
