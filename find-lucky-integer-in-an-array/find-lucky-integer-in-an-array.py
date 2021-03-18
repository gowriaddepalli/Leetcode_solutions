class Solution:
    def findLucky(self, arr: List[int]) -> int:
        hashmap = {}
        lucky_items = []
        for num in arr:
            if hashmap.get(num) == None:
                hashmap[num] = 1
            else:
                val = hashmap.get(num)
                hashmap[num] = val+1
        
        for k,v in hashmap.items():
            if k==v:
                lucky_items.append(k)
        
        if len(lucky_items) == 0:
            return -1
        else:
            return max(lucky_items)
        