class Solution(object):
    def maximumWealth(self, accounts):
        """
        :type accounts: List[List[int]]
        :rtype: int
        """
        max_value = 0
        sum_value = 0
        for i in range(0, len(accounts)):
            for j in range(0, len(accounts[0])):
                sum_value += accounts[i][j]
            print(sum_value)
            max_value = max(max_value, sum_value)
            sum_value = 0
        return max_value
        