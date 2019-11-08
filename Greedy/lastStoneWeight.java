class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 0){
            return 0;
        }
        Queue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i : stones){
            maxHeap.add(i);
        }
        while(maxHeap.size() >1){
            maxHeap.offer(maxHeap.poll() - maxHeap.poll());
        }
        
        return maxHeap.poll();
    }
}
