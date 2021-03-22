class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        hashmap = {}
        sum =0
        
        for i in nums:
            if i not in hashmap:
                hashmap[i] = 1
            else:
                hashmap[i] += 1
        
        for num, freq in hashmap.items():
            if freq ==1:
                sum += num
        return sum