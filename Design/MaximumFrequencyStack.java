class FreqStack {
    HashMap<Integer, Integer> freq = null;
    HashMap<Integer,Stack<Integer>> freqstack= null;
    int maxfreq = 0;

    public FreqStack() {
        freq = new HashMap<Integer, Integer>();
        freqstack = new HashMap<Integer, Stack<Integer>>();
    }
    
    public void push(int x) {
        
        // Push in the map.
        if(!freq.containsKey(x))
        {
            freq.put(x,1);
        }else
        {
            freq.put(x, freq.get(x)+1);
        }
        // get the most frequent element when the new element is added to see whether there is a change in that variable.
        maxfreq = Math.max(maxfreq, freq.get(x));
        
        //push the element in the stack based on freq as the key.
        if(!freqstack.containsKey(freq.get(x)))
        {
            freqstack.put(freq.get(x), new Stack<Integer>());
        }
        freqstack.get(freq.get(x)).add(x);

        
    }
    
    public int pop() {
     int elem = freqstack.get(maxfreq).pop();
     freq.put(elem, freq.get(elem)-1);
     if(freqstack.get(maxfreq).size()==0) maxfreq--;
    return elem;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 */
