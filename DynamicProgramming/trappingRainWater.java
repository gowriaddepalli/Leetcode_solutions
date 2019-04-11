class Solution {
    public int trap(int[] height) {
     
        if(height.length == 0){
            return 0;
        }
        
        int hieghtl2r[] = new int[height.length];
        int hieghtr2l[] = new int[height.length];
        
        hieghtl2r[0] = height[0];
        hieghtr2l[height.length -1] = height[height.length -1];
        
        for(int i = 1; i<height.length; i++){
         hieghtl2r[i] = Math.max(height[i], hieghtl2r[i-1]);   
        }
        
        for(int i = height.length -2; i>=0; i--){
         hieghtr2l[i] = Math.max(height[i], hieghtr2l[i+1]);   
        }
        
        int sum =0;
        
        for(int i =0; i<height.length; i++){
            sum += Math.min(hieghtl2r[i], hieghtr2l[i]) - height[i];
        }
        
       return sum; 
        
    }
}
