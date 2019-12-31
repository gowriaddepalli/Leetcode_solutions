class MaxStack {

    /** initialize your data structure here. */
    Node head;
    public MaxStack() {
        head = null;
    }
    
    public void push(int x) {
        if(head == null){
            head = new Node(x,x);
        }else{
            head = new Node(x,Math.max(x,head.max), head);
        }
    }
    
    public int pop() {
        Node p1 = head;
        head =head.next;
        p1.next = null;
        return p1.val;
    }
    
    public int top() {
        return head.val;
    }
    
    public int peekMax() {
        return head.max;
    }
    
    public int popMax() {
        
        /*int m = peekMax();
        int cur = pop();
        Queue<Integer> q = new LinkedList<>();
        while(cur != m)
        {
           q.add(cur);
            cur = pop();
        }
        
        while(!q.isEmpty())
        {
            push(q.remove()); 
        }
        
        return m;*/
        
        Stack<Integer> tempStack = new Stack<>();
        int max = peekMax();
        int cur = pop();
        while (cur != max) {
            tempStack.push(cur);
            cur = pop();
        }
        while (!tempStack.isEmpty()) {
            push(tempStack.pop());
        }
        return max;
    }
        
}


class Node
{
    int val;
    int max;
    Node next;
    
    public Node(int value, int max)
    {
     this.val = value;
     this.max = max;
    }
    
    public Node(int value, int max, Node next)
    {
     this.val = value;
     this.max = max;
     this.next = next;
    }
    
}

/**
 * Your MaxStack object will be instantiated and called as such:
 * MaxStack obj = new MaxStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.peekMax();
 * int param_5 = obj.popMax();
 */
