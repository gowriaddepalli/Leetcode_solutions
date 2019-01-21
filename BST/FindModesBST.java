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
    
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    int maxValue =0;
    //int maxKey =0;
    int [] modes = null;
    ArrayList<Integer> mod = new ArrayList<Integer>();
    
    public int[] findMode(TreeNode root) {
        inorderTraversal(root);
        for(Map.Entry<Integer, Integer> mp : hm.entrySet()){
            //System.out.println(" key:" + mp.getKey() +"value:" + mp.getValue());
            if(maxValue <= mp.getValue()){
             maxValue = mp.getValue();
             //maxKey = mp.getKey();
            }
        }
        
        for(Map.Entry<Integer, Integer> mp : hm.entrySet()){
            //System.out.println(" key:" + mp.getKey() +"value:" + mp.getValue());
            if(mp.getValue() == maxValue){
            mod.add(mp.getKey());
            }
        }
        modes = new int[mod.size()];
        int i=0;
        for(Object o: mod){
            //System.out.println(o.toString());
            modes[i] = (int)o;
           // System.out.println(modes[i]);
            i++;
        }
        return modes;
    }
    
    public void inorderTraversal(TreeNode root){
        
        if(root != null){
            inorderTraversal(root.right);
            if(!hm.containsKey(root.val))
            {
                hm.put(new Integer(root.val),1);
            }else
            {
                hm.put(root.val,hm.get(new Integer(root.val))+1);
            }
            inorderTraversal(root.left);
            
        }
    }
}
