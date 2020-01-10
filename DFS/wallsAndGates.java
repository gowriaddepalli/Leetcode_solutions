class Solution {
    public void wallsAndGates(int[][] rooms) {
        // the idea here for every gate value do a dfs and update the nearest value of the distance from this gate only if it is smaller.
        
        for(int i=0; i<rooms.length; i++){
            for(int j=0; j<rooms[i].length; j++){
                if(rooms[i][j]== 0){
                    dfs(i,j, 0, rooms);
                }
            }
        }
    }
    
    
    
    
    public void dfs(int i, int j, int count, int[][] rooms){
        if(i<0 ||i>=rooms.length|| j<0 || j>=rooms[i].length || count> rooms[i][j]){
            return;
        }
        
        rooms[i][j] = count;
        dfs(i+1, j, count+1, rooms);
        dfs(i, j-1, count+1, rooms);
        dfs(i-1, j, count+1, rooms);
        dfs(i, j+1, count+1, rooms);
    }
}
