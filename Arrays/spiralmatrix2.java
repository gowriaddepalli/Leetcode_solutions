class Solution {
    public int[][] generateMatrix(int n) {
        //List<Integer> al = new ArrayList<>();
        int matrix[][] = new int[n][n];
        
        int r1 = 0;
        int r2 = matrix.length-1;
        int c1 = 0;
        int c2 = matrix[0].length-1;
        int j =0;
        
        while(r1<=r2 && c1<=c2){
            for(int c =c1; c<=c2; c++){
                matrix[r1][c] = ++j;
            }
            for(int r =r1+1; r<=r2; r++){
                matrix[r][c2] = ++j;
            }
            if(r1<r2 && c1<c2){
                for(int c =c2-1; c>c1; c--){
                matrix[r2][c] = ++j;
            }
            for(int r =r2; r>r1; r--){
                matrix[r][c1] = ++j;
            }
            }
            
            r1++;
            r2--;
            c1++;
            c2--;
        }
        
        
        return matrix;
    }
}
