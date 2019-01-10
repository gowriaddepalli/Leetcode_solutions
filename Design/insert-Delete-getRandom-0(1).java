import java.util.*;

class RandomizedSet {
    ArrayList<Integer> al = null;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        al = new ArrayList<Integer>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        /*for( Integer i: al)
        {
            System.out.println(i);
        }
        if(al.contains(val))
        {
            return false;
        }*/
        if(!al.contains(val))
        {
            al.add(val);
            return true;
        }
        return false;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(al.contains(val))
        {
            al.remove(new Integer(val));
            return true;
        }
        return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom()
    {
        Random r = new Random();
		int i = r.nextInt(al.size());
        return al.get(i);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
