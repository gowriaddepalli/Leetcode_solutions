class Solution {
    public int missingElement(int[] nums, int k) {
        int n = nums.length;
        int i=0;
        int num = -1;
        
        while(i+1<n){
            if(nums[i+1]-nums[i]-1<k){
                k -= nums[i+1]-nums[i]-1;
            }else{
                num = nums[i]+k;
                return num;
            }
            i++;
        }
        if(i==n-1){
            num = nums[i]+k;
        }
        return num;
    }
}
