class Solution {
    public void sortColors(int[] nums) {
    
  // two pass sorting algo.
        
        int j =0;
        int k = nums.length -1;
        
 // logic is to put all 0's in the starting array, all 2's to the end of the array.
     // 1st put all twos.   
        for(int i=0; i<=k;i++)
        {
            while(nums[i]==2 && k>i )
            {
               int temp = nums[i];
               nums[i]=nums[k];
               nums[k]=temp;
               k--;
            }
          // then put all twos.    
            while(nums[i] == 0 && j<i)
            {   
                //System.out.println(nums[j]);
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        
      
    }
}
