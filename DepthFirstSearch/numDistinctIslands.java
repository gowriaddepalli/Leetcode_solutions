class Solution {
    int[][] grid;
    int[][] visited;
    Set<ArrayList<Integer>> hs;
    ArrayList<Integer> al;
    
    public int numDistinctIslands(int[][] grid) {
        this.grid = grid;
        this.visited = new int[grid.length][grid[0].length];
        this.hs = new HashSet<>();
        
        for(int i=0; i<grid.length; i++){
            for(int j =0; j<grid[0].length; j++){
                // arraylist to get the way of traversal.
               al = new ArrayList<>();
               dfs(i,j, 0);
                // arraylist completion after the dfs.
               if(!al.isEmpty()){
               hs.add(al);
           }
            }
        }
        
        return hs.size();
    }
    
    // Trick here is that two distinct islands are same if they perfom dfs in a similar fashion, so adding the signature.
    public void dfs(int i, int j, int startIndex){
        if(i<0 || i>=grid.length || j<0 || j>= grid[0].length || visited[i][j] ==1 || grid[i][j] == 0){
            return;
        }
        visited[i][j] =1;
        al.add(startIndex);
        dfs(i+1, j,1);
        dfs(i,j+1,2);
        dfs(i-1, j, 3);
        dfs(i,j-1,4);
        al.add(0);
    }
}
