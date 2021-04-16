class Solution:
    def maxOperations(self, nums: List[int], k: int) -> int:
        count=0
        hashmap= {}
        for i in range(0, len(nums)):
            complement = k-nums[i]
            if complement in hashmap.keys():
                if hashmap[complement]==1:
                    del hashmap[complement]
                    count += 1
                else:
                    hashmap[complement] -= 1
                    count += 1
            else:
                if nums[i] in hashmap.keys():
                    hashmap[nums[i]] += 1
                else:
                    hashmap[nums[i]] = 1
        return count
        