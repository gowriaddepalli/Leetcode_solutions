class WordDictionary(object):

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.trie = {}
        

    def addWord(self, word):
        """
        Adds a word into the data structure.
        :type word: str
        :rtype: None
        """
        t = self.trie
        for char in word:
            if char not in t:
                t[char] = {}
            t = t[char]
        t["*"] = True
            
        

    def search(self, word):
        """
        Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
        :type word: str
        :rtype: bool
        """
        ## Creating a recursive function
        def searchUtil(word, node):
            # Trying to get indices 
            for i,char in enumerate(word):
                # checking for case when character is not present
                if not char in node:
                    # checking for case when character is not present but is replaced by '.'
                    if char == '.':
                        # Recursively travelling through all possible nodes in star
                        for x in node:
                            if x != "*" and searchUtil(word[i+1:], node[x]):
                                return True                 
                    return False
                # checking for case when character is present
                else:
                    node = node[char]
            return '*' in node
            
        
        return searchUtil(word, self.trie)
        


# Your WordDictionary object will be instantiated and called as such:
# obj = WordDictionary()
# obj.addWord(word)
# param_2 = obj.search(word)
