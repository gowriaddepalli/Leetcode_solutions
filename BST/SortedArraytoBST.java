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
    public TreeNode sortedArrayToBST(int[] nums) {
        // A sorted Array is given, using the Binary Search Code we can build the tree.
        return buildTree(nums, 0, nums.length-1);
    }
    
    public TreeNode buildTree(int[] nums, int start, int end)
    {
        if(start<=end)
        {
            int mid  = (start+end)/2;
            TreeNode t = new TreeNode(nums[mid]);
            t.left = buildTree(nums,start, mid-1);
            t.right = buildTree(nums,mid+1, end);
            return t;
        }
        
        return null;
    }
}
