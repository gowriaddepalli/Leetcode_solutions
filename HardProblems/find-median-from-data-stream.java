class MedianFinder {
     LinkedList<Integer> ll;
    /** initialize your data structure here. */
    public MedianFinder() {
        ll = new LinkedList<Integer>();
    }
    
    public void addNum(int num) {
        ll.add(num);
    }
    
    public double findMedian() {
        int sz = ll.size();
        
        if(sz == 0)
        {
            return 0;
        }
        
        if(sz == 1)
        {
            return ll.get(0);
        }
        Collections.sort(ll);
        
        double elem = 0.0;
        
        if(sz%2==0)
        {
          elem = (ll.get(sz/2)+ ll.get((sz/2)-1))/2.0;
        }else
        {
          elem =   ll.get((sz/2));
        }
        
        return elem;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
