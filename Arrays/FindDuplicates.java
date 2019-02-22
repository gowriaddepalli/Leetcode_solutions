class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> al = Arrays.stream(nums).boxed().collect(Collectors.toList());
        for(int i=0;i< nums.length; i++){
            if(al.contains(i+1)){
                al.remove(new Integer(i+1));
            }
        }
        
        return al;
    }
}
