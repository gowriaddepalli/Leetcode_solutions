class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        // needed variables.
        
        int xlength = nums1.length;
        int ylength = nums2.length;
        
        if(xlength > ylength){
            // assuming the second array is the bigger one.
            return findMedianSortedArrays(nums2, nums1);
        }
        
        int low = 0;
        // the highest no of partition is no of xlength +1
        int high = xlength;
        
        while(low<=high){
            
           int partitionX = (low+high)/2;
           int partitionY = (xlength+ylength+1)/2 - partitionX;
           
           int maxXLeft = partitionX ==0 ? Integer.MIN_VALUE : nums1[partitionX-1];
           int minXRight = partitionX==xlength ? Integer.MAX_VALUE : nums1[partitionX];
               
           int maxYLeft = partitionY ==0 ? Integer.MIN_VALUE : nums2[partitionY-1];
           int minYRight = partitionY==ylength ? Integer.MAX_VALUE : nums2[partitionY];  
            
            
            if(maxXLeft<= minYRight && minXRight>=maxYLeft){
                if((xlength+ylength)%2 ==0){
                    return (double)(Math.max(maxXLeft, maxYLeft) + Math.min(minXRight, minYRight))/2.0;
                }else{
                    return (double) Math.max(maxXLeft, maxYLeft);
                }
            } else if(maxXLeft > minYRight){
                high = partitionX-1;
            }else{
                low = partitionX+1;
            }
            
        } 
        
         return -1;
    }
}
