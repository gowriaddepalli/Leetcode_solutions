class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int pivot =-1;
        
		// empty array
        if(n == 0)
        {
            return false;
        }
        
		//single element
        if(n ==1)
        {
           if(nums[0]== target)
           {
               return true;
           }
            return false;
        }
        // find the pivot element
        for(int i=1; i<n; i++){
           if(nums[i]<nums[i-1])
           {
               pivot =i;
           } 
        }
        
        //System.out.println(nums[pivot]);
        
		// array is completed sorted.
        if(pivot ==-1)
        {
            if(Arrays.binarySearch(nums,target)>-1){
                return true;
            }
            return false;
        }
        
		// binary search around the pivot.
        if(target== nums[pivot]){
            return true;
        }else if( target > nums[pivot] && target<= nums[n-1])
        {
           int nums1[] = Arrays.copyOfRange(nums, pivot+1, n);
           int pos1 = Arrays.binarySearch(nums1, target);
            if(pos1>=0)
            {
                return true;
            }
            return false;
        }else if(target> nums[pivot] && target>nums[n-1] && target<=nums[pivot-1])
        {
            int nums2[] = Arrays.copyOfRange(nums, 0, pivot);
            int pos1 = Arrays.binarySearch(nums2,target);
            if(pos1>=0)
            {
                return true;
            }
            return false;
        }
        
        return false;
    }
}
