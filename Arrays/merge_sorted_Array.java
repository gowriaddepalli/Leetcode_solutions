class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     
        // The trick here is to start from the back.
        // pointer to the last element of array nums1.
        int nums1last = m-1;
        // pointer to the last element of array nums2.
        int nums2last = n-1;
        // pointer to the last array of nums1.
        int mergedlast = m+n-1;
        
        while(mergedlast>=0)
        {
          // if nums2 runs out- means copying is over.
          if(nums2last<0)
        {
            break;
        }
         else if(nums1last<0)
        {
             //if nums1 runs out, simply copy over the elemets
             nums1[mergedlast--] = nums2[nums2last--];
        }
        else if(nums1[nums1last]>= nums2[nums2last])
        {
         // if nums1 is greater than nums2, copy the element in the hole.
         nums1[mergedlast--] = nums1[nums1last--];   
        }else
        {
            //if nums2 is gretaer than nums1, copy the element in space.
            nums1[mergedlast--] = nums2[nums2last--];
        }  
        }
    
    }
}
