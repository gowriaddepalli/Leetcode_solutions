class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] targetpos = new int[2];
        Arrays.fill(targetpos, -1);
        int start =-1;
        int end = -1;
        
        int p = binarySearch(nums,0, nums.length-1, target);
        int r = p;
        System.out.println(p);
        
        while(p>0 && nums[p-1] == target)
        {
            p--;
        }
        start = p;
        targetpos[0]= start;
        
        while(r+1<=nums.length-1 && nums[r+1] == target)
        {
            r++;;
        }
        
        end =r;
        targetpos[1]= end;
        
        return targetpos;
    }
    
    public int binarySearch(int[] nums, int low, int high, int target)
    {
        int mid = low+ (high-low)/2;
        
        if(low <=high)
        {
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(target > nums[mid])
            {
               return binarySearch(nums, mid+1, high, target); 
            }
            else if (target< nums[mid])
            {
                return binarySearch(nums, low, mid-1, target);
            }
        }
        return -1;
    }
}
