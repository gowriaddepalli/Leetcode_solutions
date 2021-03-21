class Solution:
    def numPairsDivisibleBy60(self, time: List[int]) -> int:
        remainders = collections.defaultdict(int)
        return_value = 0
        for t in time:
            if t%60 == 0:
                return_value += remainders[0]
            else:
                return_value += remainders[60-t%60]
            remainders[t%60]+=1
        return return_value
        