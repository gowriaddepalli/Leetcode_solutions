class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(int i=0; i<tasks.length; i++){
            hm.put(tasks[i], hm.getOrDefault(tasks[i],0)+1);
        }
        
        // building a max heap.
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        
        // adding all values in maxheap
        pq.addAll(hm.values());
        
        int cycles = 0;
        
        while(!pq.isEmpty())
        {
        List<Integer> temp = new ArrayList<>();
        for(int i=0; i<n+1; i++){
            if(!pq.isEmpty())
            {
                temp.add(pq.remove());
            }
        }
          
            for(int k : temp){
                if(--k>0){
                    pq.add(k);
                }
            }
           cycles += pq.isEmpty() ? temp.size() : n+1; 
        }
        
        
        return cycles;
    }
}
