# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def isCompleteTree(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        nodes = [(root,1)]
        i=0
        while i < len(nodes):
            node,v = nodes[i]
            i += 1
            if node:
                nodes.append((node.left, 2*v))
                nodes.append((node.right, 2*v+1))
        return nodes[-1][1] == len(nodes)
        
/*
This problem reduces to two smaller problems: representing the "location" of each node as a (depth, position) pair, and formalizing what it means for nodes to all be left-justified.

If we have say, 4 nodes in a row with depth 3 and positions 0, 1, 2, 3; and we want 8 new nodes in a row with depth 4 and positions 0, 1, 2, 3, 4, 5, 6, 7; then we can see that the rule for going from a node to its left child is (depth, position) -> (depth + 1, position * 2), and the rule for going from a node to its right child is (depth, position) -> (depth + 1, position * 2 + 1). Then, our row at depth dd is completely filled if it has 2^{d-1}2 
d−1
  nodes, and all the nodes in the last level are left-justified when their positions take the form 0, 1, ... in sequence with no gaps.

A cleaner way to represent depth and position is with a code: 1 will be the root node, and for any node with code v, the left child will be 2*v and the right child will be 2*v + 1. This is the scheme we will use. Under this scheme, our tree is complete if the codes take the form 1, 2, 3, ... in sequence with no gaps.

Algorithm

At the root node, we will associate it with the code 1. Then, for each node with code v, we will associate its left child with code 2 * v, and its right child with code 2 * v + 1.

We can find the codes of every node in the tree in "reading order" (top to bottom, left to right) sequence using a breadth first search. (We could also use a depth first search and sort the codes later.)

Then, we check that the codes are the sequence 1, 2, 3, ... with no gaps. Actually, we only need to check that the last code is correct, since the last code is the largest value.*/
