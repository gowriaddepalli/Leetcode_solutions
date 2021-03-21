class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]: 
        
        def binary_search(nums: List[int], low: int, high:int, target: int) -> int:
            if(high >= low):
                mid = (high+low)//2
                if nums[mid] == target:
                    return mid
                elif nums[mid] > target:
                    return binary_search(nums,low,mid-1,target)
                else:
                    return binary_search(nums,mid+1,high,target)
            else:
                return -1
            
        result = binary_search(nums,0,len(nums)-1, target)
        if(result == -1):
            return [-1,-1]
        real_low = result
        real_high = result
        while(real_low-1>-1 and nums[real_low-1] == target):
            real_low =real_low-1
        while(real_high+1<len(nums) and nums[real_high+1] == target):
            real_high =real_high+1
        return [real_low,real_high]
    
    
            
        
