class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans =0;
        
        for(int t: time){
            int d = (60- t%60)%60;
            ans += hm.getOrDefault(d,0);
            hm.put(t%60, 1+ hm.getOrDefault(t%60,0));
        }
        
       return ans; 
    }
}
