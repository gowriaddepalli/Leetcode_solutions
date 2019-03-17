class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        for(int x: A) pq.add(x);
        while( K--  > 0) 
        {
            // whole purpose is to turn to pos no, and compare by magnitude and lessen the minimum value.
            System.out.println(pq.peek());
            pq.add(-pq.poll());
        }
  
        int sum  = 0;
        for(int i = 0; i < A.length; i++){
            //System.out.println(pq.peek());
            sum += pq.poll();
        }
        return sum;
    }
}
