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
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        //First Integer for tree level, second Integer for tree height.
        TreeMap<Integer, TreeMap<Integer, List<Integer>>> map = new TreeMap<>(); 

        helper(map, root, 0, 0);

        for (int level : map.keySet()) {
            List<Integer> list = new ArrayList<>();

            for (List<Integer> value : map.get(level).values()) {
                list.addAll(value);
            }

            result.add(list);
        }

        return result;
    }

    private void helper(TreeMap<Integer, TreeMap<Integer, List<Integer>>> map, TreeNode root, int level, int height) {
        if (root == null) {
            return;
        } else {
            if (!map.containsKey(level)) {
                TreeMap<Integer, List<Integer>> temp = new TreeMap<>();
                List<Integer> list = new ArrayList<>();
                list.add(root.val);
                temp.put(height, list);
                map.put(level, temp);
            } else {
                if (!map.get(level).containsKey(height)) {
                    List<Integer> list = new ArrayList<>();
                    list.add(root.val);
                    map.get(level).put(height, list);
                } else {
                    map.get(level).get(height).add(root.val);
                }
            }
        }

        helper(map, root.left, level - 1, height + 1);
        helper(map, root.right, level + 1, height + 1);
    }
}
