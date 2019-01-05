Runtime: 6 ms, faster than 97.37% of Java online submissions for Contains Duplicate III.

class Solution {
public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

    if(nums.length<2){
        return false;
    }
	HashSet<Integer> hs = new HashSet<Integer>();
	
	for(int i=0; i<nums.length; i++)
	{
	hs.add(nums[i]);
	}
	if(t==0 && nums.length == hs.size())
	{
	return false;
	}
    
    for(int i=0; i<nums.length; i++)
    {
      for(int j=i+1;j<=i+k &&j<nums.length;j++)
      {
        /*if((nums[j] ==  Integer.MAX_VALUE && start<0) || (nums[j] <0 && start==Integer.MAX_VALUE))
        {
            return false;
        }*/ // dont do this. tradoff with variable data size.
         
          if(Math.abs((long)nums[j]-(long)nums[i]) <= (long)t)  {
            return true;
        }
      }
    }
    
 return false;   
}
}

Two important points for noting down;

Convert to long in case of overflow.
The hashset is needed incase t==0, and the list contains duplicate elements.
