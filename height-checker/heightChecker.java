class Solution {
    public int heightChecker(int[] heights) {
        // To get in O(n) bucketing sort works.
        
       int[] bucket = new int[101];
       
       for(int height: heights){
           bucket[height]++;
       }
        int current_height=0;
        int result=0;
        
        for(int height: heights){
            while(bucket[current_height] ==0){
               current_height++; 
            }
            
            if(current_height != height){
                result++;
            }
            bucket[current_height]--;
        }
       return result; 
    }
}
