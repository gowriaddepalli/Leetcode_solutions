class MyHashSet {

    /** Initialize your data structure here. */
    ArrayList<Integer> al = null;
    public MyHashSet() {
        al = new ArrayList<Integer>();
    }
    
    public void add(int key) {
        if( !al.contains(key))
        {
            al.add(new Integer(key));
        }
    }
    
    public void remove(int key) {
         if(al.contains(new Integer(key)))
        {
            al.remove(new Integer(key));
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
         if(al.contains(key))
        {
           return true; 
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
