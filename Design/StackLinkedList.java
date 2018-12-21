class MinStack {

    /** initialize your data structure here. */
    Node head;
    
    public MinStack() {
        head = null;
    }
    
    public void push(int x) {
        
        if(head == null){
            head = new Node(x, x);
        } else
        {
            head = new Node(x, Math.min(x, head.min), head);
        }
    }
    
    public void pop() {
            Node po = head;
            head = head.next;
    
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
}

public class Node {
    
    int val;
    int min;
    Node next;
    
    Node(int value, int minimum){
        this.val = value;
        this.min = minimum;
        this.next = null;
    }
    
    Node(int value, int minimum, Node next){
        this.val = value;
        this.min = minimum;
        this.next = next;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
