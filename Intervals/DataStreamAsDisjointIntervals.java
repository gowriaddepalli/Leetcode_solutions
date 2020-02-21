class Range
{
    Integer start;
    Integer end;
    public Range(Integer start, Integer end){
        this.start = start;
        this.end = end;
    }
    
}

class SummaryRanges {
    TreeMap<Integer, Range> tm;

    /** Initialize your data structure here. */
    public SummaryRanges() {
        tm = new TreeMap<>();
        
    }
    
    public void addNum(int val) {
       if(tm.containsKey(val)) return;
        
       Integer l = tm.lowerKey(val);
       Integer h = tm.higherKey(val);
       
      // val exists in continuos range.
       // case - 1 - 1, 2
        //       4 - 4, 9
        // insert 3
       if(l != null && h != null && val+1 == h && tm.get(l).end + 1 == val){
           tm.get(l).end = tm.get(h).end;
           tm.remove(h);
       }
        // case where the number has lower bound and can be merged within this bound
        // case - 1 - 1, 2
        //       6 - 6, 9
        // insert 3
        // o/p -> 1 - 1,3
        //  insert 4
        // 1- 1,4
        else if(l != null && tm.get(l).end+1 >= val ){
           tm.get(l).end = Math.max(tm.get(l).end, val);
            
        // case where the number is just lesser than the higher bound.
        // case - 1 - 1, 2
        //       6 - 6, 9
        // insert 5
        // o/p -> 1 - 1,2
         //         5 - 5,9
       }else if(h != null && val+1 == h){
           tm.put(val, new Range(val, tm.get(h).end));
            tm.remove(h);
        }
        else
           // Interval does not exists;
       {
          tm.put(val, new Range(val,val));
       }
    }
    
    public int[][] getIntervals() {
      List<Range> al = new ArrayList<Range>(tm.values());
      int[][] s = new int[al.size()][2];
        int i =0;
      for(Range r: al){
          s[i][0] = r.start;
          s[i][1] = r.end;
          i++;
      }
      return s;
    }
}

/**
 * Your SummaryRanges object will be instantiated and called as such:
 * SummaryRanges obj = new SummaryRanges();
 * obj.addNum(val);
 * int[][] param_2 = obj.getIntervals();
 */
/*public class SummaryRanges {
    TreeMap<Integer, Interval> tree;

    public SummaryRanges() {
        tree = new TreeMap<>();
    }

    public void addNum(int val) {
        if(tree.containsKey(val)) return;
        Integer l = tree.lowerKey(val);
        Integer h = tree.higherKey(val);
        if(l != null && h != null && tree.get(l).end + 1 == val && h == val + 1) {
            tree.get(l).end = tree.get(h).end;
            tree.remove(h);
        } else if(l != null && tree.get(l).end + 1 >= val) {
            tree.get(l).end = Math.max(tree.get(l).end, val);
        } else if(h != null && h == val + 1) {
            tree.put(val, new Interval(val, tree.get(h).end));
            tree.remove(h);
        } else {
            tree.put(val, new Interval(val, val));
        }
    }

    public List<Interval> getIntervals() {
        return new ArrayList<>(tree.values());
    }
}*/
