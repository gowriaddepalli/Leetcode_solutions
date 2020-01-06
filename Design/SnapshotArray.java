class SnapshotArray {
    
    // Reference:https://leetcode.com/problems/snapshot-array/discuss/454280/Java-list-and-map-explained-clean-beats-95
    
    ArrayList<HashMap<Integer, Integer>> al;

    public SnapshotArray(int length) {
        al = new ArrayList<>();
        al.add(new HashMap());
    }
    
    public void set(int index, int val) {
        al.get(al.size()-1).put(index,val);
    }
    
    public int snap() {
        al.add(new HashMap());
        return al.size()-2;
    }
    
    public int get(int index, int snap_id) {
        for(int i= snap_id; i>=0; i--){
            if(al.get(i).containsKey(index)){
                return al.get(i).get(index);
            }
        }
        return 0;
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */
