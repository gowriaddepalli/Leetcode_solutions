class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        int newintervalstart = newInterval[0];
        int newintervalend = newInterval[1];
        LinkedList<int[]> ll = new LinkedList<>();
        int idx = 0;
        int n = intervals.length;
        
        // The algorithm is as:
        
        // 1. Traverse till we get the non overlapping interval.
        
        while(idx <n && newintervalstart> intervals[idx][0])
        {
            ll.add(intervals[idx++]);
        }        
        int[] op = new int[2];
        // 2. Merge the new interval with the last interval in the set.
        if(ll.isEmpty() || ll.getLast()[1]< newintervalstart){ // no overlap or list is empty.
            ll.add(newInterval);
        }else
        {
            op = ll.removeLast();
            //merge
            op[1] = Math.max(op[1], newintervalend);
            ll.add(op);
        }
        
        // 3. Traverse through the rest of the array and add to the last array or start merging.
         int[] interval = new int[2];
           while(idx<n) 
           {
               interval = intervals[idx++];
               int start = interval[0], end = interval[1];
               if (ll.getLast()[1] < start) ll.add(interval);
      // if there is an overlap, merge with the last interval
               else {
                 interval = ll.removeLast();
                 interval[1] = Math.max(interval[1], end);
                 ll.add(interval);
             }
               
           }
        return ll.toArray(new int[ll.size()][2]);
    }
}
