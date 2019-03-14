class Solution {
    public int findPairs(int[] nums, int k) {
    int len = nums.length;
    if(len < 2 || k < 0) return 0;
    
    int res = 0;
    Map<Integer, Integer> map = new HashMap<>();
    map.put(nums[0], 1);
    for(int i=1; i<len; i++){
        if(map.containsKey(nums[i])){
            if(k == 0 && map.get(nums[i]) != -1){  
                res++;
                map.put(nums[i], -1);
            }
        }else{
            res += map.getOrDefault(nums[i] + k, 0) + map.getOrDefault(nums[i] - k, 0);
            map.put(nums[i], 1);
        }
            
    }
    
    return res;
}
}
