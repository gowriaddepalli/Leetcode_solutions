class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n==0)
        {
          return;  
        }
        //int[] numcpy = new int[n]; 
        //int temp = 0;
        for(int j = 0;j<k; j++){
         int temp = nums[n-1];   
        for(int i=n-1; i>0; i--)
        {
           /*temp = nums[(i-k-1+n)%n];
           nums[(i-k-1+n)%n] = nums[i];
           nums[i] = temp;*/
           // int temp = a[i];
            nums[i] = nums[i-1];
            //numcpy[(i-k-1+n)%n] = nums[i];
        }
            nums[0] = temp;
        }
        
       /*  for(int i=0; i<n; i++)
        {
           System.out.print(nums[i]);
        }*/
        
    }
}
