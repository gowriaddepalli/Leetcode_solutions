class Solution {
    public List<String> summaryRanges(int[] nums) {
       List<String> alist = new ArrayList<>(); 
        if(nums.length==0){
            return alist;
        }
       int i=0; 
       int j=1;
        int n = nums.length;
        
       while(i<n-1 && j<n){
           while(j<n && nums[j] == nums[j-1]+1){
               j++;
           }
           StringBuffer sb = new StringBuffer();
           sb.append(""+ nums[i]);
           //System.out.println(sb.toString());
           if(j-1 > i){
           sb.append("->");
           int k = j-1;
           sb.append(""+ nums[k]);
           }
           
           alist.add(sb.toString());
           i=j;
           //System.out.println(i);
           j++;
           
       }
        if(i==n-1){
            alist.add(""+nums[i]);
        }
        return alist;
    }
}
