class Solution {
    
    public int minDistance(String word1, String word2) {
        
        int m = word1.length();
        int n = word2.length();
        
        int[][] lengthDP = new int[m+1][n+1];
        
        for(int i = 0; i<= m; i++){
            for(int j=0; j<=n; j++){
                
                if(i ==0)  // match with empty string of word1.
                {
                  lengthDP[i][j] = j;  
                }
                else if(j == 0) //// match with empty string of word2.
                {
                    lengthDP[i][j] = i;
                }else if(word1.charAt(i-1) == word2.charAt(j-1))// when both characters are same.
                {
                    lengthDP[i][j] = lengthDP[i-1][j-1]; // just copy the same value.
                }else
                {
                  lengthDP[i][j] = 1+ min(lengthDP[i-1][j], lengthDP[i-1][j-1], lengthDP[i][j-1]);   // minimum of the operations - remove/replace/insert.
                }
                
            }
        }
    return  lengthDP[m][n]; // start from the last to recurse to the base.
}
    
    public int min(int a, int b, int c)
    {
        return ((a<b) ? ((a<c) ? a :c) : ((b<c)? b: c));
    }
    }
