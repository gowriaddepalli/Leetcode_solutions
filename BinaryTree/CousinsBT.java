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
    TreeNode p1 = null;
    TreeNode p2 = null;
    int h1 =-1;
    int h2 = -1;
 //   int h = -1;
    
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null){
            return false;
        }
        
        traverse(root,x,y,0, null);
     //   System.out.println(p1.val);
    //    System.out.println(p2.val);
    //    System.out.println(h1);
    //    System.out.println(h2);
        if(p1 != p2  && h1== h2){
            return true;
        }
            
        return false;
    }
    
    public void traverse(TreeNode root, int x, int y, int height, TreeNode parent){
        if(root == null){
            return;
        }
     //   h += 1;
        
        if(root.val == x){
            p1= parent;
            h1 = height;
        }
        
        if(root.val == y){
            p2 = parent;
            h2 = height;
        }
        
        traverse(root.left,x,y, height+1,root);
      //  h =-1;
        traverse(root.right,x,y, height+1,root);
    }
}
