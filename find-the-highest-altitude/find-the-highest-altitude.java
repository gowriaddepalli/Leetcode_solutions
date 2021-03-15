class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int n = gain.length;
        int alt = 0;
        
        for(int i=0; i<n; i++){
            alt += gain[i];
            if(max < alt){
                max = alt;
            }
        }
        
        return max;
        
    }
}