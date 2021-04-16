class Solution:
    def maxOperations(self, nums: List[int], k: int) -> int:
        count=0
        hashmap= collections.defaultdict(int)
        for n in nums:
            if hashmap[k-n]:
                hashmap[k-n] -= 1
                count += 1
            else:
                hashmap[n] += 1
        return count
        