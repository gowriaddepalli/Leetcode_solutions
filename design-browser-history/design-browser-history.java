class BrowserHistory {
    
    private Stack<String> forward;
    private Stack<String> backward;

    public BrowserHistory(String homepage) {
        forward = new Stack<String>();
        backward = new Stack<String>();
        // Initialize the stack with homepage.
        backward.push(homepage);
        
    }
    
    public void visit(String url) {
        backward.push(url);
        //Whenever you visit any page, the forward goes empty or reinitialize.
        forward = new Stack<String>();
        
    }
    
    public String back(int steps) {
        // Always ensure 1 element is always there in the stack
        while(backward.size() >1 && steps >0){
            forward.push(backward.peek());
            backward.pop();
            steps--;
        }
        return backward.peek();
    }
    
    public String forward(int steps) {
        // Add the items from forward to backward stack.
        while(forward.size()>0 && steps >0){
            backward.push(forward.peek());
            forward.pop();
            steps--;
        }
        return backward.peek();       
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */