class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> s1 = new HashSet<Integer>();
        for(int i: nums1){
            s1.add(i);
        }
        Set<Integer> s2 = new HashSet<Integer>();
        for(int i: nums2){
            s2.add(i);
        }
        s1.retainAll(s2);
        int[] arr = new int[s1.size()];
        
        int i = 0; 
        for (int x : s1) 
            arr[i++] = x; 
        
        return arr;
    }
}
