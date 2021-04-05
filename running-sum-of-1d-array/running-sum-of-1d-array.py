class Solution(object):
    def runningSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        runningSum = []
        sumval = 0
        for i in range(0, len(nums)):
            sumval += nums[i]
            runningSum.append(sumval)
        return runningSum
        