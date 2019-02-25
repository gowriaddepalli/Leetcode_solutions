class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums.length==0){
            return 1;
        }
        int ans=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==i+1){
                continue;
            }
            while(nums[i]<=nums.length&&nums[i]>0&&nums[i]!=nums[nums[i]-1]){
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
        }
        int k=0;
        for(k=0;k<nums.length;k++){
            if(nums[k]!=k+1){
                break;
            }
        }
        return k+1;
    }
}
