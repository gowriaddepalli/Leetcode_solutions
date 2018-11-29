class Solution {
    public void rotate(int[][] matrix) {
        
        int n = matrix[0].length;
        
        // transpose the matrix
        
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] =  matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
       /* for(int i = 0; i<matrix[0].length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }*/
        
        
        
    // rverse the array by row.
       for(int i = 0; i<n; i++) {
            for(int j = 0; j<n/2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j]= matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    
       /*for(int i = 0; i<matrix[0].length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]);
            }
           System.out.println();        
    }*/
        
    }
}
