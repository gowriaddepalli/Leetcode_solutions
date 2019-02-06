class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> al = new ArrayList<Integer>();
        int n = nums.length;
        int s = (int)(n/3.0);
       // System.out.println(s);
        
        Arrays.sort(nums);
        if(n>0 && n<3){
            al.add(nums[0]);
            if(n == 2 && nums[1] != nums[0]){
                al.add(nums[1]);
            }
            return al;
        }
        
        int count =1;
        
        int i=1;
        
           while(i<n) 
             {
             while(i< n && nums[i]== nums[i-1])
             {
            count++;
                 i++;
             }
             if(count > s)
            {
             al.add(nums[i-1]) ;
            }
               count=1;
               i++;
        }
   return al;           
}
}

 
