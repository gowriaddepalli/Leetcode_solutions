class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        
        for(String w: words){
            if(hm.containsKey(w)){
                hm.put(w, hm.get(w)+1);
            }else{
                hm.put(w,1);
            }   
        }
        // sorts in ascending order.
        PriorityQueue<String> heap = new PriorityQueue<String>((w1,w2) -> hm.get(w1).equals(hm.get(w2)) ? w2.compareTo(w1) : hm.get(w1)-hm.get(w2));
       
        // removes least frequent item.
        for(String w: hm.keySet()) {
            heap.offer(w);
            if(heap.size()>k){
                heap.poll();
            }
        }
        
        // adds elements in ascending order.
        List<String> ans = new ArrayList();
        while( !heap.isEmpty()){
            ans.add(heap.poll());
        }
        Collections.reverse(ans);
        return ans;
    }
}
