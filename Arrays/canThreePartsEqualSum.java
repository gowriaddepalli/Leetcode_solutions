class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        
        int sum =0;
        
        for(int i=0; i<A.length; i++){
            sum += A[i];
        }
        
        
        int partialSum =0;
        
        for(int i=0; i<A.length; i++){
            partialSum += A[i];
            if(partialSum == sum/3){
                partialSum =0;
            }
        }
        return partialSum == 0;
    }
}
