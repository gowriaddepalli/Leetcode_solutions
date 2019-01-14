class MyStack {
    // The original queue containing elements;
    Queue<Integer> q1 = null;
    Queue<Integer> q2 = null;
    Queue<Integer> q3 = null;

    /** Initialize your data structure here. */
    public MyStack() {
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q2.add(x);
        while(!q1.isEmpty())
        {
            int a = q1.poll();
            q2.add(a);
        }
        q3= q2;
        q2=q1;
        q1=q3;
        
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(!q1.isEmpty()){
            return q1.poll();
        }
        return -1;
    }
    
    /** Get the top element. */
    public int top() {
        if(!q1.isEmpty()){
            return q1.peek();
        }
        return -1;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
