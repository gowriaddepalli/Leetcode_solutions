class Solution:
    def arrayStringsAreEqual(self, word1: List[str], word2: List[str]) -> bool:
        
        word1String =""
        word2String =""
        
        for word1string in word1:
            word1String += word1string
            
        for word2string in word2:
            word2String += word2string
            
        return word1String==word2String
    
    

 class Solution:
    def arrayStringsAreEqual(self, word1: List[str], word2: List[str]) -> bool:
        string2 = ''.join(word2)
        string2_len = len(string2)
        index = 0
        for s in word1:
            for c in s:
                if index >= string2_len or c != string2[index]:
                    return False
                index += 1
        if index == string2_len:
            return True
        else:
            return False
        
        
        
