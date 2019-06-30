class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int c = 0;
        ArrayList<Integer> al = new ArrayList<>();
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>((n1,n2) -> n2-n1);
        
        for(int i=0; i<nums.length; i++){
           heap.add(nums[i]);
            c++;
            if(c==k){
                c=0;
                i= i-k+1;
                al.add(heap.poll());
                heap.clear();
            }  
        }
        
        int fin[] = new int[al.size()];
        for(int i =0; i<al.size(); i++){
            fin[i] = al.get(i);
        }
        return fin;
    }
}
