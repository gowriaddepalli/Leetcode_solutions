class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> hash_Set = new LinkedHashSet<Integer>();
        for(int i: nums)
        {
            hash_Set.add(i);
        }
        
        int r = 0;
        
        for(Integer p: hash_Set)
        {  
            nums[r] = p;
            r++;
        }
        
        return hash_Set.size();
    }
}
