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
    
    // doing a bfs and collecting the last elements in the level.
    List<Integer> visible = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null){
            return visible;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                if(i == size-1){
                    visible.add(q.peek().val);
                }
                
                TreeNode item = q.poll();
                if(item.left != null){
                    q.add(item.left);
                }
                
                if(item.right != null){
                    q.add(item.right);
                }
                
            }
        }
        
        
        return visible;
    }
}
