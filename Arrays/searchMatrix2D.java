class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = matrix.length;
        if(matrix.length ==0){
            return false;
        }
        if(matrix[0].length ==0){
            return false;
        }
        int col = matrix[0].length;
        
        int left=col-1;
        int down=0;
        
        while(down<row && left>-1){ 
            //System.out.println(down);
            //System.out.println(left);
        if(target<matrix[down][left]){
           left--;
        } 
        else if(target>matrix[down][left]){
            down++;
        } 
        else if(target==matrix[down][left]){
            return true;
        }        
        }
        
        return false;
        
            }
}
