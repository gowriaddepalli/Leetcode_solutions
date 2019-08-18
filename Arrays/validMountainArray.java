class Solution {
    public boolean validMountainArray(int[] A) {
        if(A.length<3){
            return false;
        }
        int n = A.length;
        int i=0;
        
        while(i<n-1 && A[i+1]> A[i]){
            i++;
        }
        
        if(i==0 || i == n-1 ){
            return false;
        }
        
        while(i< n-1 && A[i+1]< A[i]){
            i++;
        }
        
        if(i != n-1 ){
            return false;
        }
        
        return true;
        
    }
}
