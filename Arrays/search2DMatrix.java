class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0)
        {
            return false;
        }
        if(matrix[0].length == 0)
        {
            return false;
        }
        int columnsize = matrix[0].length;
        int rowindex=-1;
        int columnindex=-1;
        
        for(int i =0; i<matrix.length; i++)
        {
            if(target>= matrix[i][0]){
                rowindex = i;
            }
        }
        
        if(rowindex == -1){
            return false;
        }
        
        for(int i =0; i<columnsize; i++)
        {
            if(target == matrix[rowindex][i]){
                columnindex = i;
            }
        }
        
        if(columnindex ==-1)
        {
            return false;
        }
        
        if(matrix[rowindex][columnindex] == target)
        {
           return true; 
        }
        
        return false;
    }
}
