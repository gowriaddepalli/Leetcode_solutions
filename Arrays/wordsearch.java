class Solution {
    public boolean exist(char[][] board, String word) {
        char[] w = word.toCharArray();
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
               if (exists(board, i,j,w, 0)){
                   return true;
               }
            }
        }
        return false;
    }
    
    
    public boolean exists(char[][] board, int x, int y, char[] word, int pos){
        if(pos == word.length){
            return true;
        }
        
        if(x<0 || y<0 || x== board.length || y==board[0].length){
            return false;
        }
        
        if(board[x][y] != word[pos]){
            return false;
        }
        
        char c = board[x][y];
        board[x][y] = 0;
        
        boolean exist = (exists(board, x, y+1, word, pos+1)||
                        exists(board, x+1, y, word, pos+1)||
                        exists(board, x-1, y, word, pos+1)||
                        exists(board, x, y-1, word, pos+1));
            
            
        board[x][y] = c;
        return exist;
    }
}
