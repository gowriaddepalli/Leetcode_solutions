class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        return len(heights) - sum([(x == y) for x,y in zip(heights, sorted(heights))])