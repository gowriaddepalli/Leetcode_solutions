/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BSTIterator {
    
    Stack<Integer> st = null;

    public BSTIterator(TreeNode root) {
        st = new Stack<Integer>();
        inorderTraversal(root);
    }
    
    /** @return the next smallest number */
    public int next() {
        
        if(!st.isEmpty()){
            return st.pop();
        }
       return -1; 
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(st.size() == 0){
            return false;
        }
        return true;
    }
    
    public void inorderTraversal(TreeNode root){
        if(root != null){
            inorderTraversal(root.right);
            st.push(root.val);
            inorderTraversal(root.left);
            
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
