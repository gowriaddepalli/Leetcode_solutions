class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int n = nums.length;
        int c =-1;
        if(nums.length ==1)
        {
            c = nums[0];
        }
        for(int i =0; i<nums.length; i++)
        {
            if(!hm.containsKey(nums[i]))
            {
                hm.put(nums[i],1);
            }else
            {
                hm.put(nums[i], hm.get(nums[i])+1);
            }
        }
        
        for(int i=0; i<nums.length; i++)
        {
          //System.out.println(hm.get(nums[i]));
            //System.out.println(StrictMath.ceil(nums.length/2.0));
          if(hm.get(nums[i])>= Math.ceil(n/2.0))
            {
                    c = nums[i];
                    break;
            }
        }
        
        return c;
    }
}
