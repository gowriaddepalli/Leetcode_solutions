class Solution {
    public int[] shuffle(int[] nums, int n) {
       int[] nums_copy = new int[2*n];
       int j=0;
       for(int i=0; i<n; i++){
           nums_copy[j] = nums[i];
           nums_copy[j+1] = nums[i+n];
           j=j+2;
       }
        
        return nums_copy;
    }
}