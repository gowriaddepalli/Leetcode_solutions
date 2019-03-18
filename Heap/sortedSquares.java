class Solution {
    public int[] sortedSquares(int[] A) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0; i<A.length; i++){
          pq.add(A[i]*A[i]) ;
        }
        
        for(int i=0; i<A.length; i++){
          A[i]= pq.poll() ;
        }
        
        return A;
    }
}
