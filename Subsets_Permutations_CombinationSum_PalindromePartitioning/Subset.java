// Recursive code to generate all p & c.

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> allSubsetList = new ArrayList<List<Integer>>();
        
        //sort the numbers
        Arrays.sort(nums);
        
        // generate all the P & C.
       recursivebt(allSubsetList, new ArrayList<Integer>(), nums, 0);
        
        return allSubsetList;
    }
   
    // There will in all be 2 ^ n subsets.
    
    public void recursivebt(List<List<Integer>> allSubsetList, List<Integer> temp, int [] nums, int start)
    {
        // add the subsets in the list while entering the the recurive code, so that empty list is added too.
        allSubsetList.add(new ArrayList<Integer>(temp));
        // iterating through the array.
        for(int i =start; i<nums.length; i++)
        {
        // keeping the first array in the list constant.
         temp.add(nums[i]);
            
         // call the recursive code for the next of the following values.
         recursivebt(allSubsetList, temp, nums, i+1);
            
         // remove the element latest added to add other options.
         temp.remove(temp.size()- 1);
        }
        
    }
}
