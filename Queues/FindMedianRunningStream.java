class MedianFinder { 
    PriorityQueue<Integer> min = null;
    PriorityQueue<Integer> max =  null;   
    /** initialize your data structure here. */ 
    public MedianFinder() 
    { 
       // Max or Min heap. 
        // Storing the half elements in min elements, and half in max elements. 
       min = new PriorityQueue();
       max = new PriorityQueue(Collections.reverseOrder());
    } 
     
    public void addNum(int num) {
        // max heap stores the data stream element the first half elems.  
        max.offer(num);
        // min heap stores the data stream element the second half elems. 
        min.offer(max.poll());
        if(min.size() > max.size())
        { 
            max.offer(min.poll());
        } 
    } 
     
    public double findMedian() 
    { 
        if(min.size() == max.size())
        { 
           System.out.println(max.peek());
           System.out.println(min.peek());
            return (max.peek()+ min.peek())/2.0 ;   
        }else 
        { 
            System.out.println(max.peek());
            return max.peek();
        } 
    } 
} 
 
/** 
 * Your MedianFinder object will be instantiated and called as such: 
 * MedianFinder obj = new MedianFinder(); 
 * obj.addNum(num); 
 * double param_2 = obj.findMedian(); 
 */ 
