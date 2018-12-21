// This is time limit exceeded due to all permutations being generated.
Use clone to create copy of object instance.

import java.util.Random; 
class Solution {
    static int[] nums_org;
    ArrayList<int[]> permArray;
    int permLength = 0;
    Random rand;
    
    public Solution(int[] nums) 
    {
         nums_org = nums;
         rand = new Random();  
         permArray = new ArrayList<int[]>();
         permute(nums, 0, nums.length);
         permLength = permArray.size();
         for(int[] i: permArray){
             for(int y=0; y<i.length; y++){
                 System.out.print(i[y]);
                 System.out.print(" ");
           }
            System.out.println();
           }
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums_org;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int rand_int = rand.nextInt(permLength); 
        int[] numsPerm = permArray.get(rand_int);
        return numsPerm;
    }
    
    public void permute(int[] nums, int start, int end)
    {
       if(start == end){
           permArray.add(nums);
       }
        
        for(int i=start;i<end;i++)
       {
           nums = swap(nums,start,i);
           permute(nums, start+1, end);
           nums = swap(nums,start,i);
       } 
        
    }
    
    public int[] swap(int[] nums, int start, int end){
        
        int nums_new[] = nums.clone();
        int temp = nums_new[start];
        nums_new[start] = nums_new[end];
        nums_new[end] = temp;
        return nums_new;
    }
    
    public static void main(String[] args){
        Solution obj = new Solution(nums_org);
        int[] param_1 = obj.reset();
        int[] param_2 = obj.shuffle();
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
