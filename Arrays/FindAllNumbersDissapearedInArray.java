class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // The way to access the index is of a number whose value is nums[i] is nums[nums[i]-1]
        
        // so for every number we visit we mark its index negative. so the numbers not visited will be positive whose indices havent been visited or dont exist.
        List<Integer> al = new ArrayList<Integer>();
        
        for(int i=0; i<nums.length; i++){
            // Math.abs is used to  ignore the negative value which gets marked.
            if(nums[Math.abs(nums[i]) - 1] > 0){
                nums[Math.abs(nums[i]) - 1] = - nums[Math.abs(nums[i]) - 1];
            }
        }
        
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                al.add(i+1);
            }
        }
        
        return al;
    }
}
