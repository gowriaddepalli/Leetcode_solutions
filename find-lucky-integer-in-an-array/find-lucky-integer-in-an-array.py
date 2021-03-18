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
        
        
        
        
class Solution:
    def findLucky(self, arr: List[int]) -> int:
    # We can simply pass the input array into the Counter constructor,
    # and it will convert it into a dictionary of num -> count.
        counts = collections.Counter(arr)
        largest_lucky_number = -1
        # Check each num -> count pair in the dictionary.
        for num, count in counts.items():
            # If this is a lucky number
            if num == count:
                # Keep the largest out of this lucky number and our current largest.
                largest_lucky_number = max(largest_lucky_number, num)
        return largest_lucky_number
        
        
