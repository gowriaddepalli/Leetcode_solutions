class Solution {
    public int countComponents(int n, int[][] edges) {
        
        int count=0;
       
        // build the adjacency list.
        
    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
      
    Set<Integer> visited = new HashSet<>();
        for(int i=0; i<n; i++){
            adjList.add(new ArrayList<Integer>());
        }
        
        for(int i=0; i<edges.length; i++){
            adjList.get(edges[i][0]).add(edges[i][1]);
            adjList.get(edges[i][1]).add(edges[i][0]);
        }
        
    for(int i=0;i<n;i++){
        if(!visited.contains(i)){
            count++;
            dfs(i,adjList,visited);
        }
    }
        
  return count;  
}
    
    
    public void dfs(int i, ArrayList<ArrayList<Integer>> adjList, Set<Integer> visited){
        visited.add(i);
        // do dfs on its neighbours.
        for(int neighbour: adjList.get(i)){
            if(!visited.contains(neighbour)){
                dfs(neighbour, adjList, visited);
            }
        }
    }
    
    
    
}
