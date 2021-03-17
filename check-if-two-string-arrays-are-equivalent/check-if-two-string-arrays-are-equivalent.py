class Solution:
    def arrayStringsAreEqual(self, word1: List[str], word2: List[str]) -> bool:
        
        word1String =""
        word2String =""
        
        for word1string in word1:
            word1String += word1string
            
        for word2string in word2:
            word2String += word2string
            
        return word1String==word2String
        
        
        