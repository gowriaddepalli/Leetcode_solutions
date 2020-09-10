class Trie(object):

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.trie = {} #create a dictionary.
        

    def insert(self, word):
        """
        Inserts a word into the trie.
        :type word: str
        :rtype: None
        """
        t = self.trie  #pointer to root node
        for char in word:
            if char not in t:
                t[char] = {} #making child nodes
            t = t[char]  #traverse through tree
        t["*"] = True 
        

    def search(self, word):
        """
        Returns if the word is in the trie.
        :type word: str
        :rtype: bool
        """
        t = self.trie  #pointer to root node
        for char in word:
            if char not in t:
                return False  # fail fast
            t = t[char] #traverse through tree
        return "*" in t   # check if the leaf node is *
        
        

    def startsWith(self, prefix):
        """
        Returns if there is any word in the trie that starts with the given prefix.
        :type prefix: str
        :rtype: bool
        """
        t = self.trie  #pointer to root node
        for char in prefix:
            if char not in t:
                return False
            t = t[char] #traverse through tree
        return True
        


# Your Trie object will be instantiated and called as such:
# obj = Trie()
# obj.insert(word)
# param_2 = obj.search(word)
# param_3 = obj.startsWith(prefix)

""" Time and space Complexity

Insert and search costs O(key_length), however the memory requirements of Trie is O(ALPHABET_SIZE * key_length * N) where N is number of keys in Trie. """
