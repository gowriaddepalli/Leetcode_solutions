class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null)
            return (new ArrayList<List<Integer>>());
        ArrayList<TreeNode> q = new ArrayList<TreeNode>();
        ArrayList<TreeNode> tempQ;
        
        List<List<Integer>> BFS = new ArrayList<List<Integer>>();
        q.add(root);
        
        while(q.size() != 0){
            tempQ = new ArrayList<TreeNode>(q);
            List<Integer> lvl_list = new ArrayList<Integer>();
            q.clear();
            while(tempQ.size() != 0){
                TreeNode x = tempQ.remove(0);
                lvl_list.add(x.val);
                if(x.left!=null)
                    q.add(x.left);
                if(x.right!=null)
                    q.add(x.right);
            }
            BFS.add(0,lvl_list);
        }
        
        return BFS;
    }
}
