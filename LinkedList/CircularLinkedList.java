/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
*/

//https://leetcode.com/problems/insert-into-a-sorted-circular-linked-list/discuss/467566/Find-3-conditions-to-solve-the-problem-Java-13-line
class Solution {
public Node insert(Node head, int insertVal) {
    Node insert = new Node(insertVal);
    if (head == null) {
        insert.next = insert;
        return insert;
    }
    Node cur = head;
    while (!(cur.val <= insertVal && cur.next.val >= insertVal) &&                           // condition 1
           !(cur.val <= insertVal && cur.next.val <= insertVal && cur.val > cur.next.val) && // condition 2
           !(cur.val >= insertVal && cur.next.val >= insertVal && cur.val > cur.next.val)) { // condition 3
        cur = cur.next;
        if (cur == head) break;
    }
    insert.next = cur.next;
    cur.next = insert;
    return head;
}
}
