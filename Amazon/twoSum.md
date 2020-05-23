#### 2 sum - Arrays, HashMap

Logic - while iterating through a solution, store the number in a HashMap, and simultaneously find complement if it exists and return both.


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int retarray[] = new int[2];
        for(int i=0; i<nums.length; i++){
            int complement = target-nums[i];
            if(hm.containsKey(complement)){
                retarray[0] = i;
                retarray[1] = hm.get(complement);
                return retarray;
            }else{
                hm.put(nums[i],i);
            }
        }
        
        return retarray;
    }
}

Time Complexity: O(n)
Space Complexity: O(n), Retrieval- O(1)

