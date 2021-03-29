class BrowserHistory {
    
    private Stack<String> forward;
    private Stack<String> backward;

    public BrowserHistory(String homepage) {
        forward = new Stack<String>();
        backward = new Stack<String>();
        backward.push(homepage);
        
    }
    
    public void visit(String url) {
        backward.push(url);
        forward = new Stack<String>();
        
    }
    
    public String back(int steps) {
        String popped = "";
        while(backward.size() >1 && steps >0){
            popped= backward.pop();
            forward.push(popped);
            steps--;
        }
        return backward.peek();
    }
    
    public String forward(int steps) {
        String popped = "";
        while(forward.size()>0 && steps >0){
            popped = forward.pop();
            backward.push(popped);
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