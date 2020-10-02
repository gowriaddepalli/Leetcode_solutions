class Solution {
    public int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        int count = 0;
        for(int i=1;i<A.length;i++){
            if(A[i] <= A[i-1]){
                int diff = (A[i-1]+1) - A[i]; // handle a case where while increasing the previous array becomes larger than the current array.
                A[i]=A[i-1]+1;
                count+=diff;  
            }
        }
        return count;
    }
}
