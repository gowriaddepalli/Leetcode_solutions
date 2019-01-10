class RandomizedCollection {
    
    ArrayList<Integer> al = null;

    /** Initialize your data structure here. */
    public RandomizedCollection() {
        al = new ArrayList<Integer>();
    }
    
    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        if(!al.contains(val))
        { 
            al.add(val);
            return true; 
        } 
        al.add(val);
        return false; 
    }
    
    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        if(al.contains(val))
        { 
            al.remove(new Integer(val));
            return true; 
        } 
        return false; 
    }
    
    /** Get a random element from the collection. */
    public int getRandom() {
        Random r = new Random();
		int i = r.nextInt(al.size());
        return al.get(i);
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
