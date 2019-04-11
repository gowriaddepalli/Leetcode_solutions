import java.util.*;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    String NodeRoot = "**";
    String splitter = ",";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString();
    }
    
    
    private void buildString(TreeNode root, StringBuilder sb) {
        if(root == null){
            sb.append(NodeRoot);
            sb.append(splitter);
        }else{
             sb.append(root.val);
             sb.append(splitter);
             buildString(root.left, sb);
             buildString(root.right, sb);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Deque<String> dq = new ArrayDeque<String>(Arrays.asList(data.split(splitter)));
            return buildTree(dq);
    }
    
    private TreeNode buildTree(Deque<String> dq){
        String s = dq.removeFirst();
        if(s.equals(NodeRoot)){
            return null;
        }else
        {
          int val = Integer.valueOf(s);
          TreeNode n = new TreeNode(val);
          n.left = buildTree(dq);
          n.right = buildTree(dq);
          return n;          
        }
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
