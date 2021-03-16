class Solution {
    public int[] decompressRLElist(int[] nums) {
    
        List<Integer> arraylist = new ArrayList<>();
        
        for(int i=0; i<nums.length; i=i+2){
            int freq = nums[i];
            while(freq>0){
                arraylist.add(nums[i+1]);
                freq--;
            }
        }
        
        int[] arr = new int[arraylist.size()];  
        int j=0;
        for(int x: arraylist){
            arr[j] = x;
            j++;
        }
        
       return arr;
    }
}