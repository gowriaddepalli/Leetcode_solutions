class Solution:
    def countMatches(self, items: List[List[str]], ruleKey: str, ruleValue: str) -> int:
        ruleKeyMap = {"type": 0, "color": 1, "name": 2}
        ruleIndex = ruleKeyMap[ruleKey]
        count = 0
        
        for itemlist in items:
            print(itemlist[ruleIndex])
            if itemlist[ruleIndex] == ruleValue:
                count = count + 1
        return count
            
        