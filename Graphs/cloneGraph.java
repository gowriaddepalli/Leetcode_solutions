/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/
class Solution {
    
    // The aim here is to a dfs on this graph while maintaiing visited nodes anad creating clone on the go.
    
    private static HashMap<Node, Node> visited = new HashMap<>();
    
    public Node cloneGraph(Node node) {
        if(node == null){
            return null;
        }
        
        // return if we visit the original node.
        if(visited.containsKey(node)){
            return visited.get(node);
        }
        // cloning the node and putting it in hashmap.
        Node clone = new Node(node.val, new ArrayList());
        visited.put(node, clone);
        
        // getting the neighbours of the node and adding to the nodes neighbours.
        for(Node n : node.neighbors){
            clone.neighbors.add(cloneGraph(n));
        }
        
        return clone;
    }
}
