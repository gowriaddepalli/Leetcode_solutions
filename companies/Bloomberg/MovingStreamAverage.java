class MovingAverage {
    
    Deque<Integer> dq;
    int size; int sum;
    

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        this.dq = new LinkedList<Integer>();
        this.size = size;
        this.sum = 0;
    }
    
    public double next(int val) {
        if(dq.size() < size){
            this.dq.addLast(val);
            this.sum += val;
            return sum/(double)dq.size();
        }else
        {
           int temp = this.dq.pollFirst();
           this.sum -= temp;
           this.dq.addLast(val);
           this.sum += val;
           return sum/(double)dq.size();
        }
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
