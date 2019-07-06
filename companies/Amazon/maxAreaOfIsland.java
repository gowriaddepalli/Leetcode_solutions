class Solution {
        int[][] grid;
        int[][] visited;
    
    public int maxAreaOfIsland(int[][] grid) {
        int c = 0;
        this.grid = grid;
        int m = grid.length;
        int n = grid[0].length;
        
        if( m==0 || n==0 )
        {
            return 0;
        }
        
        visited = new int[m][n];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                   c = Math.max(c, dfs(i,j));
              
            }
        }
        return c;
    }
    
    public int dfs(int i, int j)
    {
        if(i<0 || i>= grid.length || j<0 || j>=grid[0].length || visited[i][j] ==1 || grid[i][j] == 0){
            return 0;
        }
      
        visited[i][j] = 1;
        
        return (1+ dfs(i+1,j)+ dfs(i-1,j)+ dfs(i,j-1)+ dfs(i,j+1));
        
    }
}
