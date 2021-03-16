class Solution:
    def countMatches(self, items: List[List[str]], ruleKey: str, ruleValue: str) -> int:
        #ruleKeyMap = {"type": 0, "color": 1, "name": 2}
        #ruleIndex = ruleKeyMap[ruleKey]
        if ruleKey == "type":
            ruleIndex = 0
        elif ruleKey == "color":
            ruleIndex = 1
        else:
            ruleIndex = 2
            
        count = 0
        
        for itemlist in items:
            if itemlist[ruleIndex] == ruleValue:
                count += 1
        return count
            
        