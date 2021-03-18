class Solution:
    def buildArray(self, target: List[int], n: int) -> List[str]:
        ans = []
        mapping = set(target)
        for i in range(1, n+1):
            ans.append('Push')
            if i not in mapping:
                ans.append('Pop')
            if i == target[-1]:
                break
        return ans 
                
        