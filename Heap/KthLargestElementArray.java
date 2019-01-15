class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        /* O(nlogn) solution
        int n = nums.length;
        if(nums.length == 1)
        {
            return nums[0];
        }
        Arrays.sort(nums);
        return nums[n-k]; */
        
        //using min heap
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>((n1,n2) -> n1-n2);
        for(int n:nums){
            heap.add(n);
            //making space for elemnts when nums.length greater than k
            if(heap.size()>k){
                heap.poll();
            }
        }
        
        return heap.poll();
    }
}
