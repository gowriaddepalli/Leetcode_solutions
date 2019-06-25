class Solution {
    public int maxArea(int[] height) {
        
        int maxArea=0; int l=0; int r = height.length -1;
        
        while(l<r){
            // Area to find the maximum area, for which the minimum height is needed.
            maxArea = Math.max(maxArea, Math.min(height[l], height[r])*(r-l));
            
            if(height[l]< height[r]){
                l++;
            }else{
                r--;
            }
        }
        
        return maxArea;
    }
}
