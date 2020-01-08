class Solution {
    Stack<Integer> st = new Stack<Integer>();
    int low = Integer.MIN_VALUE;
    public boolean verifyPreorder(int[] preorder) {
        
        
        for(int i=0; i<preorder.length; i++){
            if(preorder[i] <low){
                return false;
            }
            while(!st.isEmpty() && preorder[i]>st.peek()){
                low = st.pop();
            }
            st.push(preorder[i]);
            
        }
        
        
        return true;
    }
}
