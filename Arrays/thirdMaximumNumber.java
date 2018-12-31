class Solution {
    public int thirdMax(int[] nums) {
        
        if(nums.length==2){
            return ((nums[0]> nums[1])? nums[0] :nums[1]);
        }
        
        if(nums.length == 1){
            return nums[0];
        }
        
        if(nums.length == 0)
        {
           return (int) (-1 * Double.POSITIVE_INFINITY); 
        }
        
        TreeMap<Integer, Integer> hmap = new TreeMap<Integer, Integer>();
        
        for(int n: nums){
            hmap.put(n,1);
        }
        
        int hmax = 0;
        if(hmap.size() < 3){
            return hmap.lastKey();
        }
        
        int sizeStop = hmap.size() - 2;
        int i = 0;
        int val = 0;
        
        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
            i++;
            if(i == sizeStop){
                val = entry.getKey();
            }
        }
        
        return val;
    }
}
