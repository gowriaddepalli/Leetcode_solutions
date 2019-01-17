class MyHashSet {

    /** Initialize your data structure here. */
    int buckets = 1000; // the number modulus this will be stored here.
    int nobuckets = 1001; // to store more values.
    boolean[][]  no = null;
    
    public MyHashSet() {
        no = new boolean[buckets][];
    }
    
    public int hash(int key)
    {
        return key% buckets;
    }
    
    public int postn(int key)
    {
        return key/buckets;
    }
    
    public void add(int key) {
        if(no[hash(key)] ==  null)
        {
            no[hash(key)] = new boolean[nobuckets];
        }
        no[hash(key)][postn(key)] = true;
        
    }
    
    public void remove(int key) {
        if(no[hash(key)] != null && no[hash(key)][postn(key)])
        {
            no[hash(key)][postn(key)] = false;
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key)
    {
        if(no[hash(key)] == null)
        {
            return false;
        }
        if(no[hash(key)][postn(key)])
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
