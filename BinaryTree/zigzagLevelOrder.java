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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
    List<List<Integer>> ret = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    int l = 0;
    while (!queue.isEmpty()) {
        int size = queue.size();
        List<Integer> level = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            TreeNode node = queue.poll();
            if (node != null) {
                level.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        if (!level.isEmpty()) {
            if (l % 2 == 1) {
                Collections.reverse(level);
            }
            ret.add(level);
        }
        l++;
    }
    return ret;
    }
}
