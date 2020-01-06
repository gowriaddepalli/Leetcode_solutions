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
    int max_hieght=0;
    int value = -1;
    public int findBottomLeftValue(TreeNode root) {
        if(root == null){
            return -1;
        }
        
        if(root.left == null && root.right == null){
            return root.val;
        }
        
        traverse(root,0);
        

        return value;
    }
    
    public void traverse(TreeNode root, int hieght)
    {
        if(root == null){
            return;
        }
        // the first postorder traversal touches the leftmost leaf node.
        if(hieght>max_hieght && root.left == null  && root.right == null){
            max_hieght = hieght;
            value = root.val;
        }

        
        traverse(root.left,hieght+1);
        traverse(root.right,hieght+1);
    }
}
