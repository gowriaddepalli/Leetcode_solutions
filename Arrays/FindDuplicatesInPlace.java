class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> al = new ArrayList<Integer>();
        if(nums.length>1)
        {
            for(int i=0; i<nums.length;i++){
                int val = Math.abs(nums[i]);
                 if(nums[val-1] > 0) {
                    nums[val-1] *= -1; 
                } else {
                    al.add(Math.abs(nums[i]));
                }
            }
        }
        return al;
    }
}
